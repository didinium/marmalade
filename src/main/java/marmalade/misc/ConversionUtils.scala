package marmalade.misc

import org.apache.commons.math3.complex.Complex

/**
   Copyright 2015 Mahesh Khanwalkar

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

object ConversionUtils {

    def toComplex(data: Array[Double]): Array[Complex] = {

        /* data is an Array that contains 'a' and 'b' (a + bi)
           so, the length MUST be even */

        if (data.length % 2 != 0)
            return null

        val complex: Array[Complex] = new Array[Complex](data.length / 2)

        var j = 0
        for (i <- data.indices if i % 2 == 0) {
            val real = data(i)
            val comp = data(i + 1)

            complex(j) = new Complex(real, comp)
            j += 1
        }

        complex
    }

    def toDouble(complex : Array[Complex]): Array[Double] = {
        val dArr = new Array[Double](complex.length * 2)

        var j = 0
        for(i <- dArr.indices if i % 2 == 0) {
            val comp = complex(j)

            dArr(i) = comp.getReal
            dArr(i + 1) = comp.getImaginary

            j += 1
        }

        dArr
    }
}

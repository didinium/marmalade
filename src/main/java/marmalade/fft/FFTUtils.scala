package marmalade.fft

import marmalade.misc.ConversionUtils
import org.apache.commons.math3.complex.Complex
import org.jtransforms.fft.DoubleFFT_1D

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

object FFTUtils {
    def doFFT(data: Array[Complex]): Array[Complex] = {
        val fft = new DoubleFFT_1D(data.length)
        val equiv = ConversionUtils.toDouble(data)

        fft.complexForward(equiv)
        ConversionUtils.toComplex(equiv)
    }

    def doiFFT(data: Array[Complex]): Array[Complex] = {
        val fft = new DoubleFFT_1D(data.length)
        val equiv = ConversionUtils.toDouble(data)

        fft.complexForward(equiv)
        ConversionUtils.toComplex(equiv)
    }
}

import marmalade.ConversionUtils

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

object UtilTest {
    def main(args: Array[String]) {
        val dArr = new Array[Double](10)
        for(i <- dArr.indices){
            dArr(i) = i
        }

        println("[" + dArr.mkString(", ") + "]")
        val complex = ConversionUtils.toComplex(dArr)

        println("[" + complex.mkString(", ") + "]")
        val data = ConversionUtils.toDouble(complex)

        println("[" + data.mkString(", ") + "]")
    }
}

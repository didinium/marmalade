package marmalade.audio

import javax.sound.sampled.DataLine.Info
import javax.sound.sampled.{AudioSystem, SourceDataLine, DataLine, AudioFormat}

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

class AudioUtil {
    private val format = new AudioFormat(131072, 8, 1, true, false)
    private val mic = AudioSystem.getTargetDataLine(format)

    def startMic() = {
        mic.open()
        mic.start()
    }
}

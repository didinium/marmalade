import marmalade.note.{NoteType, Note}

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

object NoteTest {
    def main(args: Array[String]) {
        val note = new Note
        note.setType(NoteType.Half)

        println(note.getType)
        note.setFrequency(440.0)

        println(note.getFrequency)
    }
}

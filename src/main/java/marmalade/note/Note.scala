package marmalade.note

import marmalade.note.NoteType.NoteType

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

class Note {
    private var nType: NoteType = _
    private var freq: Double = _

    def setType(note : NoteType) : Unit = nType = note
    def setFrequency(freq : Double) : Unit = this.freq = freq


    def getType = nType
    def getFrequency = freq
}

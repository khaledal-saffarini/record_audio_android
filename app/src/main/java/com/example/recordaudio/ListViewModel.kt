package com.example.recordaudio

class  ListViewModel{
    var id: String? = null
    var record_name: String? = null

    constructor(id: String, _record_name: String) {
        this.id = id
        this.record_name = _record_name
    }
}
// Autogenerated by convert_protofile.py on 2015-05-04.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Enum.java
package com.rethinkdb.proto;

public enum ResponseType {

    SUCCESS_ATOM(1),
    SUCCESS_SEQUENCE(2),
    SUCCESS_PARTIAL(3),
    WAIT_COMPLETE(4),
    CLIENT_ERROR(16),
    COMPILE_ERROR(17),
    RUNTIME_ERROR(18);

    public final int value;

    private ResponseType(int value){
        this.value = value;
    }
}
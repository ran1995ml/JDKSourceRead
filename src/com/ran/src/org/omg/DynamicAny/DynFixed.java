package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynFixed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u311/1894/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, September 27, 2021 5:16:46 AM PDT
*/


/**
    * DynFixed objects support the manipulation of IDL fixed values.
    * Because IDL does not have a generic type that can represent fixed types with arbitrary
    * number of digits and arbitrary scale, the operations use the IDL string type.
    */
public interface DynFixed extends DynFixedOperations, org.omg.DynamicAny.DynAny, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynFixed

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.kegmil.example.pcbook.pb;

public interface MemoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kegmil.pcbook.Memory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 value = 1;</code>
   * @return The value.
   */
  long getValue();

  /**
   * <code>.kegmil.pcbook.Memory.Unit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.kegmil.pcbook.Memory.Unit unit = 2;</code>
   * @return The unit.
   */
  com.kegmil.example.pcbook.pb.Memory.Unit getUnit();
}

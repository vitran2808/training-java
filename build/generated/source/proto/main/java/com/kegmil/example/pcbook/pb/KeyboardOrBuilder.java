// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.kegmil.example.pcbook.pb;

public interface KeyboardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kegmil.pcbook.Keyboard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kegmil.pcbook.Keyboard.Layout layout = 1;</code>
   * @return The enum numeric value on the wire for layout.
   */
  int getLayoutValue();
  /**
   * <code>.kegmil.pcbook.Keyboard.Layout layout = 1;</code>
   * @return The layout.
   */
  com.kegmil.example.pcbook.pb.Keyboard.Layout getLayout();

  /**
   * <code>bool backlit = 2;</code>
   * @return The backlit.
   */
  boolean getBacklit();
}

package com.tw.learning.objects;

// solution1: only abstract class
abstract class Door {
  abstract void open();
  abstract void close();
  abstract void alarm();
}

class AlarmDoor extends Door {
  @Override
  void open(){}
  @Override
  void close(){}
  @Override
  void alarm(){}
}

//// solution2: only interface
//interface Door{
//  void open();
//  void close();
//  void alarm();
//}
//
//class AlarmDoor implements  Door {
//  void open(){}
//  void close(){}
//  void alarm(){}
//}
//
//// solution3: interface and abstract class
//// for door, make door abstract
//abstract class Door{
//  abstract void open();
//  abstract void close();
//}
//
//// for alarm, interface, to abstract some specific behaviour of something
//interface Alarm{
//  void alarm();
//}
//
//class AlarmDoor extends Door implements Alarm{
//  void open(){}
//  void close(){}
//  void alarm(){}
//}

package com.android.modules.utils;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class BasicShellCommandHandler {
    public FileDescriptor getIn() { return null; }
    public FileDescriptor getOut() { return null; }
    public FileDescriptor getErr() { return null; }
    public PrintWriter getOutPrintWriter() { return null; }
    public PrintWriter getErrPrintWriter() { return null; }
    public void printHelp(PrintWriter pw) {}
    public void onHelp() {}
    public int onCommand(String cmd) { return 0; }
    public String getNextArg() { return null; }
    public String getNextArgRequired() { return null; }
    public int handleDefaultCommands(String cmd) { return 0; }
    public int exec(Object target, FileDescriptor in, FileDescriptor out, FileDescriptor err, String[] args) { return 0; }
}

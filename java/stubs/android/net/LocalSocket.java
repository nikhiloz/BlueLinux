package android.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LocalSocket implements java.io.Closeable {
    public void connect(LocalSocketAddress endpoint) throws IOException {}
    public void bind(LocalSocketAddress endpoint) throws IOException {}
    public InputStream getInputStream() throws IOException { return null; }
    public OutputStream getOutputStream() throws IOException { return null; }
    public FileDescriptor getFileDescriptor() { return null; }
    @Override
    public void close() throws IOException {}

    public LocalSocket() {}
    public LocalSocket(FileDescriptor fd) {}
    public FileDescriptor[] getAncillaryFileDescriptors() { return null; }
    public void setSoTimeout(int timeout) {}
    public void shutdownInput() {}
    public void shutdownOutput() {}

}

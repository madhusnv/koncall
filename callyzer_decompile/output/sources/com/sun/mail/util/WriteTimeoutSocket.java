package com.sun.mail.util;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class WriteTimeoutSocket extends Socket {
    private final ScheduledExecutorService ses;
    private final Socket socket;
    private final int timeout;

    public WriteTimeoutSocket(Socket socket, int i10) {
        this.socket = socket;
        this.ses = Executors.newScheduledThreadPool(1);
        this.timeout = i10;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        this.socket.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.socket.close();
        } finally {
            this.ses.shutdownNow();
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.socket.connect(socketAddress, 0);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.socket.getChannel();
    }

    public FileDescriptor getFileDescriptor$() throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        for (Class<?> superclass = this.socket.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredMethod = superclass.getDeclaredMethod("getFileDescriptor$", null);
            } catch (Exception unused) {
            }
            if (FileDescriptor.class.isAssignableFrom(declaredMethod.getReturnType())) {
                return (FileDescriptor) declaredMethod.invoke(this.socket, null);
            }
            continue;
        }
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.socket.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return this.socket.getInputStream();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return this.socket.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.socket.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.socket.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.socket.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return this.socket.getOOBInline();
    }

    @Override // java.net.Socket
    public <T> T getOption(SocketOption<T> socketOption) {
        throw new UnsupportedOperationException("WriteTimeoutSocket.getOption");
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() {
        return new TimeoutOutputStream(this.socket.getOutputStream(), this.ses, this.timeout);
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.socket.getPort();
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() {
        return this.socket.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.socket.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return this.socket.getReuseAddress();
    }

    @Override // java.net.Socket
    public int getSendBufferSize() {
        return this.socket.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return this.socket.getSoLinger();
    }

    @Override // java.net.Socket
    public int getSoTimeout() {
        return this.socket.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return this.socket.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return this.socket.getTrafficClass();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.socket.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.socket.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.socket.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.socket.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.socket.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i10) throws IOException {
        this.socket.sendUrgentData(i10);
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z6) throws SocketException {
        this.socket.setKeepAlive(z6);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z6) throws SocketException {
        this.socket.setOOBInline(z6);
    }

    @Override // java.net.Socket
    public <T> Socket setOption(SocketOption<T> socketOption, T t7) {
        throw new UnsupportedOperationException("WriteTimeoutSocket.setOption");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i10, int i11, int i12) {
        this.socket.setPerformancePreferences(i10, i11, i12);
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i10) throws SocketException {
        this.socket.setReceiveBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z6) throws SocketException {
        this.socket.setReuseAddress(z6);
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i10) throws SocketException {
        this.socket.setSendBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z6, int i10) throws SocketException {
        this.socket.setSoLinger(z6, i10);
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i10) throws SocketException {
        this.socket.setSoTimeout(i10);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z6) throws SocketException {
        this.socket.setTcpNoDelay(z6);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i10) throws SocketException {
        this.socket.setTrafficClass(i10);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.socket.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.socket.shutdownOutput();
    }

    @Override // java.net.Socket
    public Set<SocketOption<?>> supportedOptions() {
        return Collections.EMPTY_SET;
    }

    @Override // java.net.Socket
    public String toString() {
        return this.socket.toString();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i10) throws IOException {
        this.socket.connect(socketAddress, i10);
    }

    public WriteTimeoutSocket(int i10) {
        this(new Socket(), i10);
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i10, int i11) throws IOException {
        this(i11);
        this.socket.connect(new InetSocketAddress(inetAddress, i10));
    }

    public WriteTimeoutSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11, int i12) throws IOException {
        this(i12);
        this.socket.bind(new InetSocketAddress(inetAddress2, i11));
        this.socket.connect(new InetSocketAddress(inetAddress, i10));
    }

    public WriteTimeoutSocket(String str, int i10, int i11) throws IOException {
        this(i11);
        this.socket.connect(new InetSocketAddress(str, i10));
    }

    public WriteTimeoutSocket(String str, int i10, InetAddress inetAddress, int i11, int i12) throws IOException {
        this(i12);
        this.socket.bind(new InetSocketAddress(inetAddress, i11));
        this.socket.connect(new InetSocketAddress(str, i10));
    }
}

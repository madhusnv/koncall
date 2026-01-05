package net.schmizz.sshj.common;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SSHRuntimeException extends RuntimeException {
    public SSHRuntimeException() {
        super((String) null);
    }

    public SSHRuntimeException(String str, Exception exc) {
        super(str);
        initCause(exc);
    }
}

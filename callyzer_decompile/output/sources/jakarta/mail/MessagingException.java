package jakarta.mail;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class MessagingException extends Exception {
    private static final long serialVersionUID = -7569192289819959253L;
    private Exception next;

    public MessagingException() {
        initCause(null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.next;
    }

    public synchronized Exception getNextException() {
        return this.next;
    }

    public synchronized boolean setNextException(Exception exc) {
        Exception exc2 = this;
        while ((exc2 instanceof MessagingException) && ((MessagingException) exc2).next != null) {
            try {
                exc2 = ((MessagingException) exc2).next;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!(exc2 instanceof MessagingException)) {
            return false;
        }
        ((MessagingException) exc2).next = exc;
        return true;
    }

    @Override // java.lang.Throwable
    public synchronized String toString() {
        try {
            String string = super.toString();
            Exception exc = this.next;
            if (exc == null) {
                return string;
            }
            if (string == null) {
                string = "";
            }
            StringBuilder sb2 = new StringBuilder(string);
            while (exc != null) {
                sb2.append(";\n  nested exception is:\n\t");
                if (exc instanceof MessagingException) {
                    MessagingException messagingException = (MessagingException) exc;
                    sb2.append(super.toString());
                    exc = messagingException.next;
                } else {
                    sb2.append(exc.toString());
                    exc = null;
                }
            }
            return sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public MessagingException(String str) {
        super(str);
        initCause(null);
    }

    public MessagingException(String str, Exception exc) {
        super(str);
        this.next = exc;
        initCause(null);
    }
}

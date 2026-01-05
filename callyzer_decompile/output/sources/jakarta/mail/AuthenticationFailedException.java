package jakarta.mail;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class AuthenticationFailedException extends MessagingException {
    private static final long serialVersionUID = 492080754054436511L;

    public AuthenticationFailedException() {
    }

    public AuthenticationFailedException(int i10) {
        super("MaildroidX detected that you didn't pass [smtpUsername] or [smtpPassword] to the builder!");
    }
}

package jakarta.mail;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SendFailedException extends MessagingException {
    private static final long serialVersionUID = -6457531621682372913L;
    protected transient AbstractC3633a[] invalid;
    protected transient AbstractC3633a[] validSent;
    protected transient AbstractC3633a[] validUnsent;

    public SendFailedException() {
    }

    public AbstractC3633a[] getInvalidAddresses() {
        return this.invalid;
    }

    public AbstractC3633a[] getValidSentAddresses() {
        return this.validSent;
    }

    public AbstractC3633a[] getValidUnsentAddresses() {
        return this.validUnsent;
    }

    public SendFailedException(String str, Exception exc, AbstractC3633a[] abstractC3633aArr, AbstractC3633a[] abstractC3633aArr2, AbstractC3633a[] abstractC3633aArr3) {
        super(str, exc);
        this.validSent = abstractC3633aArr;
        this.validUnsent = abstractC3633aArr2;
        this.invalid = abstractC3633aArr3;
    }
}

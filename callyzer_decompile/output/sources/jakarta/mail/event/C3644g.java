package jakarta.mail.event;

import i0.m0;
import jakarta.mail.AbstractC3679k;
import jakarta.mail.AbstractC3682n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.event.g */
/* loaded from: classes3.dex */
public class C3644g extends AbstractC3642e {
    public static final int ADDED = 1;
    public static final int REMOVED = 2;
    private static final long serialVersionUID = -7447022340837897369L;
    protected transient AbstractC3682n[] msgs;
    protected boolean removed;
    protected int type;

    public C3644g(AbstractC3679k abstractC3679k, int i10, boolean z6, AbstractC3682n[] abstractC3682nArr) {
        super(abstractC3679k);
        this.type = i10;
        this.removed = z6;
        this.msgs = abstractC3682nArr;
    }

    @Override // jakarta.mail.event.AbstractC3642e
    public void dispatch(Object obj) {
        if (this.type != 1) {
            throw m0.m7376i(obj);
        }
        throw m0.m7376i(obj);
    }

    public AbstractC3682n[] getMessages() {
        return this.msgs;
    }

    public int getType() {
        return this.type;
    }

    public boolean isRemoved() {
        return this.removed;
    }
}

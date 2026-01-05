package jakarta.mail;

import java.io.OutputStream;
import java.util.Vector;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.p */
/* loaded from: classes3.dex */
public abstract class AbstractC3684p {

    /* renamed from: a */
    public Vector f19412a = new Vector();

    /* renamed from: b */
    public String f19413b = "multipart/mixed";

    /* renamed from: c */
    public InterfaceC3685q f19414c;

    /* renamed from: a */
    public synchronized void mo8231a(AbstractC3635c abstractC3635c) {
        try {
            if (this.f19412a == null) {
                this.f19412a = new Vector();
            }
            this.f19412a.addElement(abstractC3635c);
            abstractC3635c.setParent(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public abstract void mo8232b(OutputStream outputStream);
}

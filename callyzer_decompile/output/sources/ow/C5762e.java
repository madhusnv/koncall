package ow;

import jakarta.mail.AbstractC3682n;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.MessagingException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ow.e */
/* loaded from: classes3.dex */
public final class C5762e extends AbstractC5767j {

    /* renamed from: a */
    public final boolean f28330a;

    /* renamed from: b */
    public final C3678j f28331b;

    public C5762e(C3678j c3678j, boolean z6) {
        this.f28331b = c3678j;
        this.f28330a = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5762e)) {
            return false;
        }
        C5762e c5762e = (C5762e) obj;
        return c5762e.f28330a == this.f28330a && c5762e.f28331b.equals(this.f28331b);
    }

    public final int hashCode() {
        boolean z6 = this.f28330a;
        C3678j c3678j = this.f28331b;
        return z6 ? c3678j.hashCode() : ~c3678j.hashCode();
    }

    @Override // ow.AbstractC5767j
    public final boolean match(AbstractC3682n abstractC3682n) {
        try {
            C3678j flags = abstractC3682n.getFlags();
            boolean z6 = this.f28330a;
            C3678j c3678j = this.f28331b;
            if (!z6) {
                C3651i[] systemFlags = c3678j.getSystemFlags();
                int i10 = 0;
                while (true) {
                    if (i10 >= systemFlags.length) {
                        String[] userFlags = c3678j.getUserFlags();
                        for (String str : userFlags) {
                            if (!flags.contains(str)) {
                            }
                        }
                        return true;
                    }
                    if (flags.contains(systemFlags[i10])) {
                        break;
                    }
                    i10++;
                }
            } else if (flags.contains(c3678j)) {
                return true;
            }
        } catch (MessagingException | RuntimeException unused) {
        }
        return false;
    }
}

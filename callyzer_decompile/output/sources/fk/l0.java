package fk;

import androidx.datastore.core.CorruptionException;
import b00.C0525j;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4270b;
import nx.AbstractC5185w;
import og.p1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 implements o6.w0 {

    /* renamed from: a */
    public final x0 f10452a;

    public l0(x0 sessionGenerator) {
        AbstractC4154l.m8923f(sessionGenerator, "sessionGenerator");
        this.f10452a = sessionGenerator;
    }

    @Override // o6.w0
    /* renamed from: a */
    public final Object mo5977a() {
        return new k0(this.f10452a.m5986a(null), null, null);
    }

    @Override // o6.w0
    /* renamed from: b */
    public final Object mo5978b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            C4270b c4270b = AbstractC4271c.f21666d;
            String strM10126h = AbstractC5185w.m10126h(p1.m10812b(fileInputStream));
            c4270b.getClass();
            return (k0) c4270b.m8987a(k0.Companion.serializer(), strM10126h);
        } catch (Exception e2) {
            throw new CorruptionException("Cannot parse session data", e2);
        }
    }

    @Override // o6.w0
    /* renamed from: c */
    public final void mo5979c(Object obj, C0525j c0525j) throws IOException {
        c0525j.write(AbstractC5185w.m10128j(AbstractC4271c.f21666d.m8988b(k0.Companion.serializer(), (k0) obj)));
    }
}

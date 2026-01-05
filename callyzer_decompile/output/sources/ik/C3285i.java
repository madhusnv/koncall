package ik;

import androidx.datastore.core.CorruptionException;
import b00.C0525j;
import java.io.FileInputStream;
import java.io.IOException;
import ky.AbstractC4271c;
import ky.C4270b;
import nx.AbstractC5185w;
import o6.w0;
import og.p1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.i */
/* loaded from: classes.dex */
public final class C3285i implements w0 {

    /* renamed from: a */
    public static final C3285i f17498a = new C3285i();

    /* renamed from: b */
    public static final C3284h f17499b = new C3284h(null, null, null, null, null);

    @Override // o6.w0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        return f17499b;
    }

    @Override // o6.w0
    /* renamed from: b */
    public final Object mo5978b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            C4270b c4270b = AbstractC4271c.f21666d;
            String strM10126h = AbstractC5185w.m10126h(p1.m10812b(fileInputStream));
            c4270b.getClass();
            return (C3284h) c4270b.m8987a(C3284h.Companion.serializer(), strM10126h);
        } catch (Exception e2) {
            throw new CorruptionException("Cannot parse session configs", e2);
        }
    }

    @Override // o6.w0
    /* renamed from: c */
    public final void mo5979c(Object obj, C0525j c0525j) throws IOException {
        c0525j.write(AbstractC5185w.m10128j(AbstractC4271c.f21666d.m8988b(C3284h.Companion.serializer(), (C3284h) obj)));
    }
}

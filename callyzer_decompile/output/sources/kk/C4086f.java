package kk;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlin.jvm.internal.AbstractC4154l;
import mk.AbstractC4770i;
import nk.C5091n;
import nk.C5094q;
import nk.C5096s;
import nk.m1;
import rk.C6564a;
import rk.C6566c;
import ym.C8702m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.f */
/* loaded from: classes.dex */
public final class C4086f extends AbstractC4103w {

    /* renamed from: a */
    public final /* synthetic */ int f20966a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4103w f20967b;

    public /* synthetic */ C4086f(AbstractC4103w abstractC4103w, int i10) {
        this.f20966a = i10;
        this.f20967b = abstractC4103w;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a input) throws IOException {
        switch (this.f20966a) {
            case 0:
                return new AtomicLong(((Number) this.f20967b.mo8851b(input)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                input.mo10024h();
                while (input.mo10023R()) {
                    arrayList.add(Long.valueOf(((Number) this.f20967b.mo8851b(input)).longValue()));
                }
                input.mo10026w();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            default:
                AbstractC4154l.m8923f(input, "input");
                EnumC4099s enumC4099s = input.f31424b;
                if (enumC4099s == EnumC4099s.LEGACY_STRICT) {
                    input.H0(EnumC4099s.LENIENT);
                }
                try {
                    try {
                        AbstractC4092l abstractC4092lM9696i = AbstractC4770i.m9696i(input);
                        input.H0(enumC4099s);
                        AbstractC4103w abstractC4103w = this.f20967b;
                        abstractC4103w.getClass();
                        try {
                            C5094q c5094q = new C5094q(C5094q.f24970x);
                            c5094q.f24972s = new Object[32];
                            c5094q.f24973t = 0;
                            c5094q.f24974v = new String[32];
                            c5094q.f24975w = new int[32];
                            c5094q.U0(abstractC4092lM9696i);
                            Object objMo8851b = abstractC4103w.mo8851b(c5094q);
                            AbstractC4154l.m8920c(abstractC4092lM9696i);
                            C8702m.m16102d(objMo8851b, abstractC4092lM9696i);
                            return objMo8851b;
                        } catch (IOException e2) {
                            throw new JsonIOException(e2);
                        }
                    } catch (Throwable th2) {
                        input.H0(enumC4099s);
                        throw th2;
                    }
                } catch (OutOfMemoryError | StackOverflowError e10) {
                    throw new JsonParseException("Failed parsing JSON source: " + input + " to Json", e10);
                }
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c out, Object obj) throws IOException {
        switch (this.f20966a) {
            case 0:
                this.f20967b.mo8852c(out, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                out.mo10030j();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f20967b.mo8852c(out, Long.valueOf(atomicLongArray.get(i10)));
                }
                out.mo10032w();
                return;
            default:
                AbstractC4154l.m8923f(out, "out");
                AbstractC4103w abstractC4103w = this.f20967b;
                abstractC4103w.getClass();
                try {
                    C5096s c5096s = new C5096s();
                    abstractC4103w.mo8852c(c5096s, obj);
                    ArrayList arrayList = c5096s.f24978q;
                    if (!arrayList.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
                    }
                    AbstractC4092l abstractC4092l = c5096s.f24980s;
                    C8702m.m16100b(obj, abstractC4092l);
                    m1.f24967z.getClass();
                    C5091n.m10020f(out, abstractC4092l);
                    return;
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
        }
    }

    public C4086f(AbstractC4103w abstractC4103w, C8702m c8702m) {
        this.f20966a = 2;
        this.f20967b = abstractC4103w;
    }
}

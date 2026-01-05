package s6;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0335z;
import androidx.datastore.preferences.protobuf.C0312g;
import androidx.datastore.preferences.protobuf.C0318m;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import b00.C0525j;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import o6.w0;
import og.cf;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import r6.C6474c;
import r6.C6476e;
import r6.C6477f;
import r6.C6478g;
import r6.C6479h;
import r6.C6481j;
import r6.EnumC6480i;
import rw.AbstractC6663m;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s6.g */
/* loaded from: classes.dex */
public final class C6768g implements w0 {

    /* renamed from: a */
    public static final C6768g f32223a = new C6768g();

    @Override // o6.w0
    /* renamed from: a */
    public final Object mo5977a() {
        return new C6763b(true);
    }

    @Override // o6.w0
    /* renamed from: b */
    public final Object mo5978b(FileInputStream fileInputStream) throws CorruptionException {
        byte[] bArr;
        try {
            C6476e c6476eM12458o = C6476e.m12458o(fileInputStream);
            C6763b c6763b = new C6763b(false);
            AbstractC6766e[] pairs = (AbstractC6766e[]) Arrays.copyOf(new AbstractC6766e[0], 0);
            AbstractC4154l.m8923f(pairs, "pairs");
            c6763b.m12965b();
            if (pairs.length > 0) {
                AbstractC6766e abstractC6766e = pairs[0];
                throw null;
            }
            Map mapM12459m = c6476eM12458o.m12459m();
            AbstractC4154l.m8922e(mapM12459m, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM12459m.entrySet()) {
                String name = (String) entry.getKey();
                C6481j value = (C6481j) entry.getValue();
                AbstractC4154l.m8922e(name, "name");
                AbstractC4154l.m8922e(value, "value");
                EnumC6480i enumC6480iM12476C = value.m12476C();
                switch (enumC6480iM12476C == null ? -1 : AbstractC6767f.f32222a[enumC6480iM12476C.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        c6763b.m12969f(cf.m10580a(name), Boolean.valueOf(value.m12477t()));
                        break;
                    case 2:
                        c6763b.m12969f(new C6765d(name), Float.valueOf(value.m12480x()));
                        break;
                    case 3:
                        c6763b.m12969f(new C6765d(name), Double.valueOf(value.m12479w()));
                        break;
                    case 4:
                        c6763b.m12969f(cf.m10582c(name), Integer.valueOf(value.m12481y()));
                        break;
                    case 5:
                        c6763b.m12969f(cf.m10583d(name), Long.valueOf(value.m12482z()));
                        break;
                    case 6:
                        C6765d c6765dM10584e = cf.m10584e(name);
                        String strM12474A = value.m12474A();
                        AbstractC4154l.m8922e(strM12474A, "value.string");
                        c6763b.m12969f(c6765dM10584e, strM12474A);
                        break;
                    case 7:
                        C6765d c6765dM10585f = cf.m10585f(name);
                        a0 a0VarM12463n = value.m12475B().m12463n();
                        AbstractC4154l.m8922e(a0VarM12463n, "value.stringSet.stringsList");
                        c6763b.m12969f(c6765dM10585f, AbstractC6663m.g0(a0VarM12463n));
                        break;
                    case 8:
                        C6765d c6765d = new C6765d(name);
                        C0312g c0312gM12478u = value.m12478u();
                        int size = c0312gM12478u.size();
                        if (size == 0) {
                            bArr = b0.f2294b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0312gM12478u.mo866e(size, bArr2);
                            bArr = bArr2;
                        }
                        AbstractC4154l.m8922e(bArr, "value.bytes.toByteArray()");
                        c6763b.m12969f(c6765d, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new C6763b(AbstractC6674x.m12786n(c6763b.m12964a()), true);
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Unable to parse preferences proto.", e2);
        }
    }

    @Override // o6.w0
    /* renamed from: c */
    public final void mo5979c(Object obj, C0525j c0525j) throws IOException {
        AbstractC0335z abstractC0335zM1070a;
        Map mapM12964a = ((C6763b) obj).m12964a();
        C6474c c6474cM12457n = C6476e.m12457n();
        for (Map.Entry entry : mapM12964a.entrySet()) {
            C6765d c6765d = (C6765d) entry.getKey();
            Object value = entry.getValue();
            String str = c6765d.f32221a;
            if (value instanceof Boolean) {
                C6479h c6479hM12464D = C6481j.m12464D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c6479hM12464D.m1072c();
                C6481j.m12470q((C6481j) c6479hM12464D.f2423b, zBooleanValue);
                abstractC0335zM1070a = c6479hM12464D.m1070a();
            } else if (value instanceof Float) {
                C6479h c6479hM12464D2 = C6481j.m12464D();
                float fFloatValue = ((Number) value).floatValue();
                c6479hM12464D2.m1072c();
                C6481j.m12471r((C6481j) c6479hM12464D2.f2423b, fFloatValue);
                abstractC0335zM1070a = c6479hM12464D2.m1070a();
            } else if (value instanceof Double) {
                C6479h c6479hM12464D3 = C6481j.m12464D();
                double dDoubleValue = ((Number) value).doubleValue();
                c6479hM12464D3.m1072c();
                C6481j.m12468o((C6481j) c6479hM12464D3.f2423b, dDoubleValue);
                abstractC0335zM1070a = c6479hM12464D3.m1070a();
            } else if (value instanceof Integer) {
                C6479h c6479hM12464D4 = C6481j.m12464D();
                int iIntValue = ((Number) value).intValue();
                c6479hM12464D4.m1072c();
                C6481j.m12472s((C6481j) c6479hM12464D4.f2423b, iIntValue);
                abstractC0335zM1070a = c6479hM12464D4.m1070a();
            } else if (value instanceof Long) {
                C6479h c6479hM12464D5 = C6481j.m12464D();
                long jLongValue = ((Number) value).longValue();
                c6479hM12464D5.m1072c();
                C6481j.m12465l((C6481j) c6479hM12464D5.f2423b, jLongValue);
                abstractC0335zM1070a = c6479hM12464D5.m1070a();
            } else if (value instanceof String) {
                C6479h c6479hM12464D6 = C6481j.m12464D();
                c6479hM12464D6.m1072c();
                C6481j.m12466m((C6481j) c6479hM12464D6.f2423b, (String) value);
                abstractC0335zM1070a = c6479hM12464D6.m1070a();
            } else if (value instanceof Set) {
                C6479h c6479hM12464D7 = C6481j.m12464D();
                C6477f c6477fM12462o = C6478g.m12462o();
                c6477fM12462o.m1072c();
                C6478g.m12460l((C6478g) c6477fM12462o.f2423b, (Set) value);
                c6479hM12464D7.m1072c();
                C6481j.m12467n((C6481j) c6479hM12464D7.f2423b, (C6478g) c6477fM12462o.m1070a());
                abstractC0335zM1070a = c6479hM12464D7.m1070a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException(AbstractC5601a.m11234e(value, "PreferencesSerializer does not support type: "));
                }
                C6479h c6479hM12464D8 = C6481j.m12464D();
                byte[] bArr = (byte[]) value;
                C0312g c0312gM870c = C0312g.m870c(0, bArr.length, bArr);
                c6479hM12464D8.m1072c();
                C6481j.m12469p((C6481j) c6479hM12464D8.f2423b, c0312gM870c);
                abstractC0335zM1070a = c6479hM12464D8.m1070a();
            }
            c6474cM12457n.getClass();
            str.getClass();
            c6474cM12457n.m1072c();
            C6476e.m12456l((C6476e) c6474cM12457n.f2423b).put(str, (C6481j) abstractC0335zM1070a);
        }
        C6476e c6476e = (C6476e) c6474cM12457n.m1070a();
        int iMo808a = c6476e.mo808a(null);
        Logger logger = C0318m.f2368f;
        if (iMo808a > 4096) {
            iMo808a = 4096;
        }
        C0318m c0318m = new C0318m(c0525j, iMo808a);
        c6476e.mo809b(c0318m);
        if (c0318m.f2373d > 0) {
            c0318m.m985o();
        }
    }
}

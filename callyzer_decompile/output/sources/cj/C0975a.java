package cj;

import android.util.Size;
import com.amplifyframework.util.FieldFinder;
import i0.C3076g;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import k2.m0;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import s1.InterfaceC6730y;
import v3.g0;
import zi.f0;
import zi.q1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cj.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0975a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f5789a;

    public /* synthetic */ C0975a(int i10) {
        this.f5789a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5789a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                int i10 = C0977c.f5792f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 2:
                return FieldFinder.lambda$findModelFieldsIn$0((Field) obj, (Field) obj2);
            case 3:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 4:
                C6361k c6361k = (C6361k) obj;
                C6361k c6361k2 = (C6361k) obj2;
                return (((Number) c6361k.f30756b).intValue() - ((Number) c6361k.f30755a).intValue()) - (((Number) c6361k2.f30756b).intValue() - ((Number) c6361k2.f30755a).intValue());
            case 5:
                return ((C3076g) obj).f16460a.compareTo(((C3076g) obj2).f16460a);
            case 6:
                return AbstractC4154l.m8924g(((m0) obj).f20430b, ((m0) obj2).f20430b);
            case 7:
                return AbstractC4154l.m8924g(((InterfaceC6730y) obj).getIndex(), ((InterfaceC6730y) obj2).getIndex());
            case 8:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 9:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                float f6 = g0Var.f36833L.f36943p.f37050I;
                float f10 = g0Var2.f36833L.f36943p.f37050I;
                return f6 == f10 ? AbstractC4154l.m8924g(g0Var.m14610w(), g0Var2.m14610w()) : Float.compare(f6, f10);
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 11:
                return ((f0) ((q1) obj)).f43074a.compareTo(((f0) ((q1) obj2)).f43074a);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b10 = bArr[i11];
                    byte b11 = bArr2[i11];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
        }
    }
}

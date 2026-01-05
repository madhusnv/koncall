package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.j0g;

/* loaded from: classes2.dex */
public final class us6 extends j0g {

    /* renamed from: b */
    public final Object f49424b;

    /* renamed from: c */
    public final String f49425c;

    /* renamed from: d */
    public final String f49426d;

    /* renamed from: e */
    public final pja f49427e;

    /* renamed from: f */
    public final j0g.EnumC14421b f49428f;

    /* renamed from: g */
    public final cbj f49429g;

    /* renamed from: o.us6$a */
    public /* synthetic */ class C17440a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49430a;

        static {
            int[] iArr = new int[j0g.EnumC14421b.values().length];
            iArr[j0g.EnumC14421b.STRICT.ordinal()] = 1;
            iArr[j0g.EnumC14421b.LOG.ordinal()] = 2;
            iArr[j0g.EnumC14421b.QUIET.ordinal()] = 3;
            f49430a = iArr;
        }
    }

    public us6(Object obj, String str, String str2, pja pjaVar, j0g.EnumC14421b enumC14421b) {
        sq8.m48649h(obj, "value");
        sq8.m48649h(str, "tag");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(pjaVar, "logger");
        sq8.m48649h(enumC14421b, "verificationMode");
        this.f49424b = obj;
        this.f49425c = str;
        this.f49426d = str2;
        this.f49427e = pjaVar;
        this.f49428f = enumC14421b;
        cbj cbjVar = new cbj(m33013b(obj, str2));
        StackTraceElement[] stackTrace = cbjVar.getStackTrace();
        sq8.m48648g(stackTrace, "stackTrace");
        Object[] array = gp0.m29253T(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        cbjVar.setStackTrace((StackTraceElement[]) array);
        this.f49429g = cbjVar;
    }

    @Override // p001o.j0g
    /* renamed from: a */
    public Object mo33012a() throws cbj {
        int i = C17440a.f49430a[this.f49428f.ordinal()];
        if (i == 1) {
            throw this.f49429g;
        }
        if (i == 2) {
            this.f49427e.mo43767a(this.f49425c, m33013b(this.f49424b, this.f49426d));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new szb();
    }

    @Override // p001o.j0g
    /* renamed from: c */
    public j0g mo33014c(String str, xk7 xk7Var) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(xk7Var, "condition");
        return this;
    }
}

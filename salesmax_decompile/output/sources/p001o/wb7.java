package p001o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001o.bc7;

/* loaded from: classes2.dex */
public abstract class wb7 {

    /* renamed from: a */
    public static final xma f51712a = new xma(16);

    /* renamed from: b */
    public static final ExecutorService f51713b = cme.m21432a("fonts-androidx", 10, TransferRecord.MAXIMUM_UPLOAD_PARTS);

    /* renamed from: c */
    public static final Object f51714c = new Object();

    /* renamed from: d */
    public static final ktf f51715d = new ktf();

    /* renamed from: o.wb7$a */
    public class CallableC17806a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f51716a;

        /* renamed from: b */
        public final /* synthetic */ Context f51717b;

        /* renamed from: c */
        public final /* synthetic */ ub7 f51718c;

        /* renamed from: d */
        public final /* synthetic */ int f51719d;

        public CallableC17806a(String str, Context context, ub7 ub7Var, int i) {
            this.f51716a = str;
            this.f51717b = context;
            this.f51718c = ub7Var;
            this.f51719d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C17810e call() {
            return wb7.m54159c(this.f51716a, this.f51717b, this.f51718c, this.f51719d);
        }
    }

    /* renamed from: o.wb7$b */
    public class C17807b implements hu3 {

        /* renamed from: a */
        public final /* synthetic */ h32 f51720a;

        public C17807b(h32 h32Var) {
            this.f51720a = h32Var;
        }

        @Override // p001o.hu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C17810e c17810e) {
            if (c17810e == null) {
                c17810e = new C17810e(-3);
            }
            this.f51720a.m29771b(c17810e);
        }
    }

    /* renamed from: o.wb7$c */
    public class CallableC17808c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ String f51721a;

        /* renamed from: b */
        public final /* synthetic */ Context f51722b;

        /* renamed from: c */
        public final /* synthetic */ ub7 f51723c;

        /* renamed from: d */
        public final /* synthetic */ int f51724d;

        public CallableC17808c(String str, Context context, ub7 ub7Var, int i) {
            this.f51721a = str;
            this.f51722b = context;
            this.f51723c = ub7Var;
            this.f51724d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C17810e call() {
            try {
                return wb7.m54159c(this.f51721a, this.f51722b, this.f51723c, this.f51724d);
            } catch (Throwable unused) {
                return new C17810e(-3);
            }
        }
    }

    /* renamed from: o.wb7$d */
    public class C17809d implements hu3 {

        /* renamed from: a */
        public final /* synthetic */ String f51725a;

        public C17809d(String str) {
            this.f51725a = str;
        }

        @Override // p001o.hu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C17810e c17810e) {
            synchronized (wb7.f51714c) {
                ktf ktfVar = wb7.f51715d;
                ArrayList arrayList = (ArrayList) ktfVar.get(this.f51725a);
                if (arrayList == null) {
                    return;
                }
                ktfVar.remove(this.f51725a);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((hu3) arrayList.get(i)).accept(c17810e);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m54157a(ub7 ub7Var, int i) {
        return ub7Var.m51330d() + "-" + i;
    }

    /* renamed from: b */
    public static int m54158b(bc7.C12351a c12351a) {
        int i = 1;
        if (c12351a.m18588c() != 0) {
            return c12351a.m18588c() != 1 ? -3 : -2;
        }
        bc7.C12352b[] c12352bArrM18587b = c12351a.m18587b();
        if (c12352bArrM18587b != null && c12352bArrM18587b.length != 0) {
            i = 0;
            for (bc7.C12352b c12352b : c12352bArrM18587b) {
                int iM18590b = c12352b.m18590b();
                if (iM18590b != 0) {
                    if (iM18590b < 0) {
                        return -3;
                    }
                    return iM18590b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C17810e m54159c(String str, Context context, ub7 ub7Var, int i) {
        xma xmaVar = f51712a;
        Typeface typeface = (Typeface) xmaVar.get(str);
        if (typeface != null) {
            return new C17810e(typeface);
        }
        try {
            bc7.C12351a c12351aM49683e = tb7.m49683e(context, ub7Var, null);
            int iM54158b = m54158b(c12351aM49683e);
            if (iM54158b != 0) {
                return new C17810e(iM54158b);
            }
            Typeface typefaceM27829b = fzh.m27829b(context, null, c12351aM49683e.m18587b(), i);
            if (typefaceM27829b == null) {
                return new C17810e(-3);
            }
            xmaVar.put(str, typefaceM27829b);
            return new C17810e(typefaceM27829b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C17810e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m54160d(Context context, ub7 ub7Var, int i, Executor executor, h32 h32Var) {
        String strM54157a = m54157a(ub7Var, i);
        Typeface typeface = (Typeface) f51712a.get(strM54157a);
        if (typeface != null) {
            h32Var.m29771b(new C17810e(typeface));
            return typeface;
        }
        C17807b c17807b = new C17807b(h32Var);
        synchronized (f51714c) {
            ktf ktfVar = f51715d;
            ArrayList arrayList = (ArrayList) ktfVar.get(strM54157a);
            if (arrayList != null) {
                arrayList.add(c17807b);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c17807b);
            ktfVar.put(strM54157a, arrayList2);
            CallableC17808c callableC17808c = new CallableC17808c(strM54157a, context, ub7Var, i);
            if (executor == null) {
                executor = f51713b;
            }
            cme.m21433b(executor, callableC17808c, new C17809d(strM54157a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m54161e(Context context, ub7 ub7Var, h32 h32Var, int i, int i2) {
        String strM54157a = m54157a(ub7Var, i);
        Typeface typeface = (Typeface) f51712a.get(strM54157a);
        if (typeface != null) {
            h32Var.m29771b(new C17810e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C17810e c17810eM54159c = m54159c(strM54157a, context, ub7Var, i);
            h32Var.m29771b(c17810eM54159c);
            return c17810eM54159c.f51726a;
        }
        try {
            C17810e c17810e = (C17810e) cme.m21434c(f51713b, new CallableC17806a(strM54157a, context, ub7Var, i), i2);
            h32Var.m29771b(c17810e);
            return c17810e.f51726a;
        } catch (InterruptedException unused) {
            h32Var.m29771b(new C17810e(-3));
            return null;
        }
    }

    /* renamed from: o.wb7$e */
    public static final class C17810e {

        /* renamed from: a */
        public final Typeface f51726a;

        /* renamed from: b */
        public final int f51727b;

        public C17810e(int i) {
            this.f51726a = null;
            this.f51727b = i;
        }

        /* renamed from: a */
        public boolean m54166a() {
            return this.f51727b == 0;
        }

        public C17810e(Typeface typeface) {
            this.f51726a = typeface;
            this.f51727b = 0;
        }
    }
}

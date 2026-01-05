package com.google.android.gms.internal.measurement;

import a1.C0005d;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import c9.C0919n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import og.sa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes.dex */
public final class C1304t {

    /* renamed from: a */
    public final Object f6376a;

    /* renamed from: b */
    public final Object f6377b;

    public /* synthetic */ C1304t(Object obj, Object obj2) {
        this.f6376a = obj;
        this.f6377b = obj2;
    }

    /* renamed from: a */
    public Object m3664a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        j4 j4Var = (j4) this.f6376a;
        String str = (String) this.f6377b;
        Context context = (Context) j4Var.f6252c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        p013o.i2 i2Var = z3.f6467a;
        if (contentResolver == null) {
            i2Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (i2Var) {
            try {
                if (((HashMap) i2Var.f25539b) == null) {
                    ((AtomicBoolean) i2Var.f25538a).set(false);
                    i2Var.f25539b = new HashMap(16, 1.0f);
                    i2Var.f25544g = new Object();
                    contentResolver.registerContentObserver(a4.f6054a, true, new c4(i2Var));
                } else if (((AtomicBoolean) i2Var.f25538a).getAndSet(false)) {
                    ((HashMap) i2Var.f25539b).clear();
                    ((HashMap) i2Var.f25540c).clear();
                    ((HashMap) i2Var.f25541d).clear();
                    ((HashMap) i2Var.f25542e).clear();
                    ((HashMap) i2Var.f25543f).clear();
                    i2Var.f25544g = new Object();
                }
                Object obj = i2Var.f25544g;
                String str2 = null;
                if (((HashMap) i2Var.f25539b).containsKey(str)) {
                    String str3 = (String) ((HashMap) i2Var.f25539b).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = a4.f6054a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                } catch (zzjk unused) {
                }
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new zzjk("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new zzjk("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                            } else {
                                cursorQuery.close();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (i2Var) {
                                try {
                                    if (obj == i2Var.f25544g) {
                                        ((HashMap) i2Var.f25539b).put(str, string);
                                    }
                                } finally {
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e2) {
                        throw new zzjk("ContentProvider query failed", e2);
                    }
                } finally {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public void m3665b(C1303s c1303s) {
        ArrayList arrayList = c1303s.f6370a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((HashMap) this.f6376a).put(((EnumC1307w) obj).zzb().toString(), c1303s);
        }
    }

    /* renamed from: c */
    public InterfaceC1298n m3666c(C0919n c0919n, InterfaceC1298n interfaceC1298n) {
        sa.m10902o(c0919n);
        if (!(interfaceC1298n instanceof C1299o)) {
            return interfaceC1298n;
        }
        C1299o c1299o = (C1299o) interfaceC1298n;
        ArrayList arrayList = c1299o.f6319b;
        String str = c1299o.f6318a;
        HashMap map = (HashMap) this.f6376a;
        return (map.containsKey(str) ? (C1303s) map.get(str) : (C1303s) this.f6377b).m3638a(str, c0919n, arrayList);
    }

    /* renamed from: d */
    public void m3667d(C0919n c0919n, C0005d c0005d) {
        x4 x4Var = new x4(c0005d);
        TreeMap treeMap = (TreeMap) this.f6376a;
        for (Integer num : treeMap.keySet()) {
            C1286b c1286bM3133a = ((C1286b) c0005d.f26d).clone();
            InterfaceC1298n interfaceC1298nMo3299d = ((C1297m) treeMap.get(num)).mo3299d(c0919n, Collections.singletonList(x4Var));
            int iM10898k = interfaceC1298nMo3299d instanceof C1291g ? sa.m10898k(((C1291g) interfaceC1298nMo3299d).f6199a.doubleValue()) : -1;
            if (iM10898k == 2 || iM10898k == -1) {
                c0005d.f26d = c1286bM3133a;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f6377b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC1298n interfaceC1298nMo3299d2 = ((C1297m) treeMap2.get((Integer) it.next())).mo3299d(c0919n, Collections.singletonList(x4Var));
            if (interfaceC1298nMo3299d2 instanceof C1291g) {
                sa.m10898k(((C1291g) interfaceC1298nMo3299d2).f6199a.doubleValue());
            }
        }
    }

    public C1304t(int i10) {
        switch (i10) {
            case 3:
                this.f6376a = new TreeMap();
                this.f6377b = new TreeMap();
                break;
            default:
                this.f6376a = new HashMap();
                this.f6377b = new C1303s(6);
                C1303s c1303s = new C1303s(0);
                EnumC1307w enumC1307w = EnumC1307w.BITWISE_AND;
                ArrayList arrayList = c1303s.f6370a;
                arrayList.add(enumC1307w);
                arrayList.add(EnumC1307w.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC1307w.BITWISE_NOT);
                arrayList.add(EnumC1307w.BITWISE_OR);
                arrayList.add(EnumC1307w.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC1307w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC1307w.BITWISE_XOR);
                m3665b(c1303s);
                C1303s c1303s2 = new C1303s(1);
                EnumC1307w enumC1307w2 = EnumC1307w.EQUALS;
                ArrayList arrayList2 = c1303s2.f6370a;
                arrayList2.add(enumC1307w2);
                arrayList2.add(EnumC1307w.GREATER_THAN);
                arrayList2.add(EnumC1307w.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC1307w.IDENTITY_EQUALS);
                arrayList2.add(EnumC1307w.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC1307w.LESS_THAN);
                arrayList2.add(EnumC1307w.LESS_THAN_EQUALS);
                arrayList2.add(EnumC1307w.NOT_EQUALS);
                m3665b(c1303s2);
                C1303s c1303s3 = new C1303s(2);
                EnumC1307w enumC1307w3 = EnumC1307w.APPLY;
                ArrayList arrayList3 = c1303s3.f6370a;
                arrayList3.add(enumC1307w3);
                arrayList3.add(EnumC1307w.BLOCK);
                arrayList3.add(EnumC1307w.BREAK);
                arrayList3.add(EnumC1307w.CASE);
                arrayList3.add(EnumC1307w.DEFAULT);
                arrayList3.add(EnumC1307w.CONTINUE);
                arrayList3.add(EnumC1307w.DEFINE_FUNCTION);
                arrayList3.add(EnumC1307w.FN);
                arrayList3.add(EnumC1307w.IF);
                arrayList3.add(EnumC1307w.QUOTE);
                arrayList3.add(EnumC1307w.RETURN);
                arrayList3.add(EnumC1307w.SWITCH);
                arrayList3.add(EnumC1307w.TERNARY);
                m3665b(c1303s3);
                C1303s c1303s4 = new C1303s(3);
                EnumC1307w enumC1307w4 = EnumC1307w.AND;
                ArrayList arrayList4 = c1303s4.f6370a;
                arrayList4.add(enumC1307w4);
                arrayList4.add(EnumC1307w.NOT);
                arrayList4.add(EnumC1307w.OR);
                m3665b(c1303s4);
                C1303s c1303s5 = new C1303s(4);
                EnumC1307w enumC1307w5 = EnumC1307w.FOR_IN;
                ArrayList arrayList5 = c1303s5.f6370a;
                arrayList5.add(enumC1307w5);
                arrayList5.add(EnumC1307w.FOR_IN_CONST);
                arrayList5.add(EnumC1307w.FOR_IN_LET);
                arrayList5.add(EnumC1307w.FOR_LET);
                arrayList5.add(EnumC1307w.FOR_OF);
                arrayList5.add(EnumC1307w.FOR_OF_CONST);
                arrayList5.add(EnumC1307w.FOR_OF_LET);
                arrayList5.add(EnumC1307w.WHILE);
                m3665b(c1303s5);
                C1303s c1303s6 = new C1303s(5);
                EnumC1307w enumC1307w6 = EnumC1307w.ADD;
                ArrayList arrayList6 = c1303s6.f6370a;
                arrayList6.add(enumC1307w6);
                arrayList6.add(EnumC1307w.DIVIDE);
                arrayList6.add(EnumC1307w.MODULUS);
                arrayList6.add(EnumC1307w.MULTIPLY);
                arrayList6.add(EnumC1307w.NEGATE);
                arrayList6.add(EnumC1307w.POST_DECREMENT);
                arrayList6.add(EnumC1307w.POST_INCREMENT);
                arrayList6.add(EnumC1307w.PRE_DECREMENT);
                arrayList6.add(EnumC1307w.PRE_INCREMENT);
                arrayList6.add(EnumC1307w.SUBTRACT);
                m3665b(c1303s6);
                C1303s c1303s7 = new C1303s(7);
                EnumC1307w enumC1307w7 = EnumC1307w.ASSIGN;
                ArrayList arrayList7 = c1303s7.f6370a;
                arrayList7.add(enumC1307w7);
                arrayList7.add(EnumC1307w.CONST);
                arrayList7.add(EnumC1307w.CREATE_ARRAY);
                arrayList7.add(EnumC1307w.CREATE_OBJECT);
                arrayList7.add(EnumC1307w.EXPRESSION_LIST);
                arrayList7.add(EnumC1307w.GET);
                arrayList7.add(EnumC1307w.GET_INDEX);
                arrayList7.add(EnumC1307w.GET_PROPERTY);
                arrayList7.add(EnumC1307w.NULL);
                arrayList7.add(EnumC1307w.SET_PROPERTY);
                arrayList7.add(EnumC1307w.TYPEOF);
                arrayList7.add(EnumC1307w.UNDEFINED);
                arrayList7.add(EnumC1307w.VAR);
                m3665b(c1303s7);
                break;
        }
    }
}

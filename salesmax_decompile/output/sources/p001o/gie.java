package p001o;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gie {

    /* renamed from: a */
    public final String f25288a;

    /* renamed from: b */
    public final CharSequence f25289b;

    /* renamed from: c */
    public final CharSequence[] f25290c;

    /* renamed from: d */
    public final boolean f25291d;

    /* renamed from: e */
    public final int f25292e;

    /* renamed from: f */
    public final Bundle f25293f;

    /* renamed from: g */
    public final Set f25294g;

    /* renamed from: o.gie$a */
    public static class C13740a {
        /* renamed from: a */
        public static void m28805a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m28806b(gie gieVar) {
            Set setM28798d;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(gieVar.m28803i()).setLabel(gieVar.m28802h()).setChoices(gieVar.m28799e()).setAllowFreeFormInput(gieVar.m28797c()).addExtras(gieVar.m28801g());
            if (Build.VERSION.SDK_INT >= 26 && (setM28798d = gieVar.m28798d()) != null) {
                Iterator it = setM28798d.iterator();
                while (it.hasNext()) {
                    C13741b.m28811d(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C13742c.m28813b(builderAddExtras, gieVar.m28800f());
            }
            return builderAddExtras.build();
        }

        /* renamed from: c */
        public static Bundle m28807c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: o.gie$b */
    public static class C13741b {
        /* renamed from: a */
        public static void m28808a(gie gieVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(gie.m28794a(gieVar), intent, map);
        }

        /* renamed from: b */
        public static Set<String> m28809b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        /* renamed from: c */
        public static Map<String, Uri> m28810c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        /* renamed from: d */
        public static RemoteInput.Builder m28811d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* renamed from: o.gie$c */
    public static class C13742c {
        /* renamed from: a */
        public static int m28812a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        /* renamed from: b */
        public static RemoteInput.Builder m28813b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* renamed from: o.gie$d */
    public static final class C13743d {

        /* renamed from: a */
        public final String f25295a;

        /* renamed from: d */
        public CharSequence f25298d;

        /* renamed from: e */
        public CharSequence[] f25299e;

        /* renamed from: b */
        public final Set f25296b = new HashSet();

        /* renamed from: c */
        public final Bundle f25297c = new Bundle();

        /* renamed from: f */
        public boolean f25300f = true;

        /* renamed from: g */
        public int f25301g = 0;

        public C13743d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f25295a = str;
        }

        /* renamed from: a */
        public gie m28814a() {
            return new gie(this.f25295a, this.f25298d, this.f25299e, this.f25300f, this.f25301g, this.f25297c, this.f25296b);
        }

        /* renamed from: b */
        public C13743d m28815b(CharSequence charSequence) {
            this.f25298d = charSequence;
            return this;
        }
    }

    public gie(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.f25288a = str;
        this.f25289b = charSequence;
        this.f25290c = charSequenceArr;
        this.f25291d = z;
        this.f25292e = i;
        this.f25293f = bundle;
        this.f25294g = set;
        if (m28800f() == 2 && !m28797c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static RemoteInput m28794a(gie gieVar) {
        return C13740a.m28806b(gieVar);
    }

    /* renamed from: b */
    public static RemoteInput[] m28795b(gie[] gieVarArr) {
        if (gieVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[gieVarArr.length];
        for (int i = 0; i < gieVarArr.length; i++) {
            remoteInputArr[i] = m28794a(gieVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: j */
    public static Bundle m28796j(Intent intent) {
        return C13740a.m28807c(intent);
    }

    /* renamed from: c */
    public boolean m28797c() {
        return this.f25291d;
    }

    /* renamed from: d */
    public Set m28798d() {
        return this.f25294g;
    }

    /* renamed from: e */
    public CharSequence[] m28799e() {
        return this.f25290c;
    }

    /* renamed from: f */
    public int m28800f() {
        return this.f25292e;
    }

    /* renamed from: g */
    public Bundle m28801g() {
        return this.f25293f;
    }

    /* renamed from: h */
    public CharSequence m28802h() {
        return this.f25289b;
    }

    /* renamed from: i */
    public String m28803i() {
        return this.f25288a;
    }

    /* renamed from: k */
    public boolean m28804k() {
        return (m28797c() || (m28799e() != null && m28799e().length != 0) || m28798d() == null || m28798d().isEmpty()) ? false : true;
    }
}

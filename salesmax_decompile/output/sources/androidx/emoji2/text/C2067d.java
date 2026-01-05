package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C2066c;
import androidx.emoji2.text.C2069f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p001o.nzh;
import p001o.r56;
import p001o.u4i;
import p001o.yzf;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes2.dex */
public final class C2067d {

    /* renamed from: a */
    public final C2066c.j f7293a;

    /* renamed from: b */
    public final C2069f f7294b;

    /* renamed from: c */
    public C2066c.e f7295c;

    /* renamed from: d */
    public final boolean f7296d;

    /* renamed from: e */
    public final int[] f7297e;

    /* renamed from: androidx.emoji2.text.d$a */
    public static final class a {
        /* renamed from: a */
        public static int m6100a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m6101b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    public static class b implements c {

        /* renamed from: a */
        public u4i f7298a;

        /* renamed from: b */
        public final C2066c.j f7299b;

        public b(u4i u4iVar, C2066c.j jVar) {
            this.f7298a = u4iVar;
            this.f7299b = jVar;
        }

        @Override // androidx.emoji2.text.C2067d.c
        /* renamed from: a */
        public boolean mo6102a(CharSequence charSequence, int i, int i2, nzh nzhVar) {
            if (nzhVar.m41335k()) {
                return true;
            }
            if (this.f7298a == null) {
                this.f7298a = new u4i(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f7298a.setSpan(this.f7299b.mo6090a(nzhVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C2067d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u4i getResult() {
            return this.f7298a;
        }
    }

    /* renamed from: androidx.emoji2.text.d$c */
    public interface c {
        /* renamed from: a */
        boolean mo6102a(CharSequence charSequence, int i, int i2, nzh nzhVar);

        Object getResult();
    }

    /* renamed from: androidx.emoji2.text.d$d */
    public static class d implements c {

        /* renamed from: a */
        public final String f7300a;

        public d(String str) {
            this.f7300a = str;
        }

        @Override // androidx.emoji2.text.C2067d.c
        /* renamed from: a */
        public boolean mo6102a(CharSequence charSequence, int i, int i2, nzh nzhVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f7300a)) {
                return true;
            }
            nzhVar.m41336l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C2067d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$e */
    public static final class e {

        /* renamed from: a */
        public int f7301a = 1;

        /* renamed from: b */
        public final C2069f.a f7302b;

        /* renamed from: c */
        public C2069f.a f7303c;

        /* renamed from: d */
        public C2069f.a f7304d;

        /* renamed from: e */
        public int f7305e;

        /* renamed from: f */
        public int f7306f;

        /* renamed from: g */
        public final boolean f7307g;

        /* renamed from: h */
        public final int[] f7308h;

        public e(C2069f.a aVar, boolean z, int[] iArr) {
            this.f7302b = aVar;
            this.f7303c = aVar;
            this.f7307g = z;
            this.f7308h = iArr;
        }

        /* renamed from: d */
        public static boolean m6105d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m6106f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int m6107a(int i) {
            C2069f.a aVarM6130a = this.f7303c.m6130a(i);
            int iM6111g = 2;
            if (this.f7301a != 2) {
                if (aVarM6130a == null) {
                    iM6111g = m6111g();
                } else {
                    this.f7301a = 2;
                    this.f7303c = aVarM6130a;
                    this.f7306f = 1;
                }
            } else if (aVarM6130a != null) {
                this.f7303c = aVarM6130a;
                this.f7306f++;
            } else if (m6106f(i)) {
                iM6111g = m6111g();
            } else if (!m6105d(i)) {
                if (this.f7303c.m6131b() != null) {
                    iM6111g = 3;
                    if (this.f7306f != 1 || m6112h()) {
                        this.f7304d = this.f7303c;
                        m6111g();
                    } else {
                        iM6111g = m6111g();
                    }
                } else {
                    iM6111g = m6111g();
                }
            }
            this.f7305e = i;
            return iM6111g;
        }

        /* renamed from: b */
        public nzh m6108b() {
            return this.f7303c.m6131b();
        }

        /* renamed from: c */
        public nzh m6109c() {
            return this.f7304d.m6131b();
        }

        /* renamed from: e */
        public boolean m6110e() {
            return this.f7301a == 2 && this.f7303c.m6131b() != null && (this.f7306f > 1 || m6112h());
        }

        /* renamed from: g */
        public final int m6111g() {
            this.f7301a = 1;
            this.f7303c = this.f7302b;
            this.f7306f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean m6112h() {
            if (this.f7303c.m6131b().m41334j() || m6105d(this.f7305e)) {
                return true;
            }
            if (this.f7307g) {
                if (this.f7308h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f7308h, this.f7303c.m6131b().m41326b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2067d(C2069f c2069f, C2066c.j jVar, C2066c.e eVar, boolean z, int[] iArr, Set set) {
        this.f7293a = jVar;
        this.f7294b = c2069f;
        this.f7295c = eVar;
        this.f7296d = z;
        this.f7297e = iArr;
        m6097g(set);
    }

    /* renamed from: a */
    public static boolean m6091a(Editable editable, KeyEvent keyEvent, boolean z) {
        r56[] r56VarArr;
        if (m6095f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m6094e(selectionStart, selectionEnd) && (r56VarArr = (r56[]) editable.getSpans(selectionStart, selectionEnd, r56.class)) != null && r56VarArr.length > 0) {
            for (r56 r56Var : r56VarArr) {
                int spanStart = editable.getSpanStart(r56Var);
                int spanEnd = editable.getSpanEnd(r56Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m6092b(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m6094e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = a.m6100a(editable, selectionStart, Math.max(i, 0));
                iMin = a.m6101b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            r56[] r56VarArr = (r56[]) editable.getSpans(iMax, iMin, r56.class);
            if (r56VarArr != null && r56VarArr.length > 0) {
                for (r56 r56Var : r56VarArr) {
                    int spanStart = editable.getSpanStart(r56Var);
                    int spanEnd = editable.getSpanEnd(r56Var);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m6093c(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : m6091a(editable, keyEvent, true) : m6091a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    public static boolean m6094e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: f */
    public static boolean m6095f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: d */
    public final boolean m6096d(CharSequence charSequence, int i, int i2, nzh nzhVar) {
        if (nzhVar.m41328d() == 0) {
            nzhVar.m41337m(this.f7295c.mo6061a(charSequence, i, i2, nzhVar.m41332h()));
        }
        return nzhVar.m41328d() == 2;
    }

    /* renamed from: g */
    public final void m6097g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m6099i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* renamed from: h */
    public CharSequence m6098h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        u4i u4iVar;
        r56[] r56VarArr;
        boolean z2 = charSequence instanceof yzf;
        if (z2) {
            ((yzf) charSequence).m58571a();
        }
        if (!z2) {
            try {
                u4iVar = charSequence instanceof Spannable ? new u4i((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, r56.class) > i2) ? null : new u4i(charSequence);
            } finally {
                if (z2) {
                    ((yzf) charSequence).m58573d();
                }
            }
        }
        if (u4iVar != null && (r56VarArr = (r56[]) u4iVar.getSpans(i, i2, r56.class)) != null && r56VarArr.length > 0) {
            for (r56 r56Var : r56VarArr) {
                int spanStart = u4iVar.getSpanStart(r56Var);
                int spanEnd = u4iVar.getSpanEnd(r56Var);
                if (spanStart != i2) {
                    u4iVar.removeSpan(r56Var);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i4 = i2;
        if (i != i4 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && u4iVar != null) {
                i3 -= ((r56[]) u4iVar.getSpans(0, u4iVar.length(), r56.class)).length;
            }
            u4i u4iVar2 = (u4i) m6099i(charSequence, i, i4, i3, z, new b(u4iVar, this.f7293a));
            if (u4iVar2 != null) {
                return u4iVar2.m50949b();
            }
            if (z2) {
                ((yzf) charSequence).m58573d();
            }
            return charSequence;
        }
        if (z2) {
            ((yzf) charSequence).m58573d();
        }
        return charSequence;
    }

    /* renamed from: i */
    public final Object m6099i(CharSequence charSequence, int i, int i2, int i3, boolean z, c cVar) {
        int iCharCount;
        e eVar = new e(this.f7294b.m6127f(), this.f7296d, this.f7297e);
        int i4 = 0;
        boolean zMo6102a = true;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            iCharCount = i;
            while (i < i2 && i4 < i3 && zMo6102a) {
                int iM6107a = eVar.m6107a(iCodePointAt);
                if (iM6107a == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i = iCharCount;
                } else if (iM6107a == 2) {
                    i += Character.charCount(iCodePointAt);
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (iM6107a == 3) {
                    if (z || !m6096d(charSequence, iCharCount, i, eVar.m6109c())) {
                        i4++;
                        zMo6102a = cVar.mo6102a(charSequence, iCharCount, i, eVar.m6109c());
                    }
                }
            }
            break loop0;
        }
        if (eVar.m6110e() && i4 < i3 && zMo6102a && (z || !m6096d(charSequence, iCharCount, i, eVar.m6108b()))) {
            cVar.mo6102a(charSequence, iCharCount, i, eVar.m6108b());
        }
        return cVar.getResult();
    }
}

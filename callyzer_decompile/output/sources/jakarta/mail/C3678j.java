package jakarta.mail;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.j */
/* loaded from: classes3.dex */
public class C3678j implements Cloneable, Serializable {
    private static final int ANSWERED_BIT = 1;
    private static final int DELETED_BIT = 2;
    private static final int DRAFT_BIT = 4;
    private static final int FLAGGED_BIT = 8;
    private static final int RECENT_BIT = 16;
    private static final int SEEN_BIT = 32;
    private static final int USER_BIT = Integer.MIN_VALUE;
    private static final long serialVersionUID = 6243590407214169028L;
    private int system_flags;
    private Hashtable<String, String> user_flags;

    public C3678j() {
        this.system_flags = 0;
        this.user_flags = null;
    }

    public void add(C3651i c3651i) {
        this.system_flags = c3651i.f19330a | this.system_flags;
    }

    public void clearSystemFlags() {
        this.system_flags = 0;
    }

    public void clearUserFlags() {
        this.user_flags = null;
    }

    public Object clone() {
        C3678j c3678j;
        try {
            c3678j = (C3678j) super.clone();
        } catch (CloneNotSupportedException unused) {
            c3678j = null;
        }
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable != null) {
            c3678j.user_flags = (Hashtable) hashtable.clone();
        }
        return c3678j;
    }

    public boolean contains(C3651i c3651i) {
        return (c3651i.f19330a & this.system_flags) != 0;
    }

    public boolean equals(Object obj) {
        Hashtable<String, String> hashtable;
        if (!(obj instanceof C3678j)) {
            return false;
        }
        C3678j c3678j = (C3678j) obj;
        if (c3678j.system_flags != this.system_flags) {
            return false;
        }
        Hashtable<String, String> hashtable2 = this.user_flags;
        int size = hashtable2 == null ? 0 : hashtable2.size();
        Hashtable<String, String> hashtable3 = c3678j.user_flags;
        int size2 = hashtable3 == null ? 0 : hashtable3.size();
        if (size == 0 && size2 == 0) {
            return true;
        }
        if (c3678j.user_flags == null || (hashtable = this.user_flags) == null || size2 != size) {
            return false;
        }
        return hashtable.keySet().equals(c3678j.user_flags.keySet());
    }

    public C3651i[] getSystemFlags() {
        Vector vector = new Vector();
        if ((this.system_flags & 1) != 0) {
            vector.addElement(C3651i.f19323b);
        }
        if ((this.system_flags & 2) != 0) {
            vector.addElement(C3651i.f19324c);
        }
        if ((this.system_flags & 4) != 0) {
            vector.addElement(C3651i.f19325d);
        }
        if ((this.system_flags & 8) != 0) {
            vector.addElement(C3651i.f19326e);
        }
        if ((this.system_flags & 16) != 0) {
            vector.addElement(C3651i.f19327f);
        }
        if ((this.system_flags & 32) != 0) {
            vector.addElement(C3651i.f19328g);
        }
        if ((this.system_flags & Integer.MIN_VALUE) != 0) {
            vector.addElement(C3651i.f19329h);
        }
        C3651i[] c3651iArr = new C3651i[vector.size()];
        vector.copyInto(c3651iArr);
        return c3651iArr;
    }

    public String[] getUserFlags() {
        Vector vector = new Vector();
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable != null) {
            Enumeration<String> enumerationElements = hashtable.elements();
            while (enumerationElements.hasMoreElements()) {
                vector.addElement(enumerationElements.nextElement());
            }
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return strArr;
    }

    public int hashCode() {
        int iHashCode = this.system_flags;
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable != null) {
            Enumeration<String> enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                iHashCode += enumerationKeys.nextElement().hashCode();
            }
        }
        return iHashCode;
    }

    public void remove(C3651i c3651i) {
        this.system_flags = (~c3651i.f19330a) & this.system_flags;
    }

    public boolean retainAll(C3678j c3678j) {
        boolean z6;
        int i10 = this.system_flags;
        int i11 = c3678j.system_flags & i10;
        if (i10 != i11) {
            this.system_flags = i11;
            z6 = true;
        } else {
            z6 = false;
        }
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable == null || (c3678j.system_flags & Integer.MIN_VALUE) != 0) {
            return z6;
        }
        if (c3678j.user_flags == null) {
            boolean z10 = hashtable.size() > 0;
            this.user_flags = null;
            return z10;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            if (!c3678j.user_flags.containsKey(strNextElement)) {
                this.user_flags.remove(strNextElement);
                z6 = true;
            }
        }
        return z6;
    }

    public String toString() {
        boolean z6;
        StringBuilder sb2 = new StringBuilder();
        if ((this.system_flags & 1) != 0) {
            sb2.append("\\Answered ");
        }
        if ((this.system_flags & 2) != 0) {
            sb2.append("\\Deleted ");
        }
        if ((this.system_flags & 4) != 0) {
            sb2.append("\\Draft ");
        }
        if ((this.system_flags & 8) != 0) {
            sb2.append("\\Flagged ");
        }
        if ((this.system_flags & 16) != 0) {
            sb2.append("\\Recent ");
        }
        if ((this.system_flags & 32) != 0) {
            sb2.append("\\Seen ");
        }
        if ((this.system_flags & Integer.MIN_VALUE) != 0) {
            sb2.append("\\* ");
        }
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable != null) {
            Enumeration<String> enumerationElements = hashtable.elements();
            z6 = true;
            while (enumerationElements.hasMoreElements()) {
                if (z6) {
                    z6 = false;
                } else {
                    sb2.append(' ');
                }
                sb2.append(enumerationElements.nextElement());
            }
        } else {
            z6 = true;
        }
        if (z6 && sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public boolean contains(String str) {
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable == null) {
            return false;
        }
        return hashtable.containsKey(str.toLowerCase(Locale.ENGLISH));
    }

    public C3678j(C3678j c3678j) {
        this.system_flags = 0;
        this.user_flags = null;
        this.system_flags = c3678j.system_flags;
        Hashtable<String, String> hashtable = c3678j.user_flags;
        if (hashtable != null) {
            this.user_flags = (Hashtable) hashtable.clone();
        }
    }

    public void add(String str) {
        if (this.user_flags == null) {
            this.user_flags = new Hashtable<>(1);
        }
        this.user_flags.put(str.toLowerCase(Locale.ENGLISH), str);
    }

    public void remove(String str) {
        Hashtable<String, String> hashtable = this.user_flags;
        if (hashtable != null) {
            hashtable.remove(str.toLowerCase(Locale.ENGLISH));
        }
    }

    public boolean contains(C3678j c3678j) {
        int i10 = c3678j.system_flags;
        if ((this.system_flags & i10) != i10) {
            return false;
        }
        Hashtable<String, String> hashtable = c3678j.user_flags;
        if (hashtable == null) {
            return true;
        }
        if (this.user_flags == null) {
            return false;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            if (!this.user_flags.containsKey(enumerationKeys.nextElement())) {
                return false;
            }
        }
        return true;
    }

    public void remove(C3678j c3678j) {
        this.system_flags &= ~c3678j.system_flags;
        Hashtable<String, String> hashtable = c3678j.user_flags;
        if (hashtable == null || this.user_flags == null) {
            return;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            this.user_flags.remove(enumerationKeys.nextElement());
        }
    }

    public void add(C3678j c3678j) {
        this.system_flags |= c3678j.system_flags;
        if (c3678j.user_flags != null) {
            if (this.user_flags == null) {
                this.user_flags = new Hashtable<>(1);
            }
            Enumeration<String> enumerationKeys = c3678j.user_flags.keys();
            while (enumerationKeys.hasMoreElements()) {
                String strNextElement = enumerationKeys.nextElement();
                this.user_flags.put(strNextElement, c3678j.user_flags.get(strNextElement));
            }
        }
    }

    public C3678j(C3651i c3651i) {
        this.system_flags = 0;
        this.user_flags = null;
        this.system_flags = c3651i.f19330a;
    }
}

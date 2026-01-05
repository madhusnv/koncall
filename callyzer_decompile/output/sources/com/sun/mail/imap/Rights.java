package com.sun.mail.imap;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Rights implements Cloneable {
    private boolean[] rights;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Right {
        char right;
        private static Right[] cache = new Right[128];
        public static final Right LOOKUP = getInstance('l');
        public static final Right READ = getInstance('r');
        public static final Right KEEP_SEEN = getInstance('s');
        public static final Right WRITE = getInstance('w');
        public static final Right INSERT = getInstance('i');
        public static final Right POST = getInstance('p');
        public static final Right CREATE = getInstance('c');
        public static final Right DELETE = getInstance('d');
        public static final Right ADMINISTER = getInstance('a');

        private Right(char c2) {
            if (c2 >= 128) {
                throw new IllegalArgumentException("Right must be ASCII");
            }
            this.right = c2;
        }

        public static synchronized Right getInstance(char c2) {
            try {
                if (c2 >= 128) {
                    throw new IllegalArgumentException("Right must be ASCII");
                }
                Right[] rightArr = cache;
                if (rightArr[c2] == null) {
                    rightArr[c2] = new Right(c2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return cache[c2];
        }

        public String toString() {
            return String.valueOf(this.right);
        }
    }

    public Rights() {
        this.rights = new boolean[128];
    }

    public void add(Right right) {
        this.rights[right.right] = true;
    }

    public Object clone() {
        try {
            Rights rights = (Rights) super.clone();
            try {
                boolean[] zArr = new boolean[128];
                rights.rights = zArr;
                boolean[] zArr2 = this.rights;
                System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
                return rights;
            } catch (CloneNotSupportedException unused) {
                return rights;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public boolean contains(Right right) {
        return this.rights[right.right];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rights)) {
            return false;
        }
        Rights rights = (Rights) obj;
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.rights;
            if (i10 >= zArr.length) {
                return true;
            }
            if (zArr[i10] != this.rights[i10]) {
                return false;
            }
            i10++;
        }
    }

    public Right[] getRights() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.rights;
            if (i10 >= zArr.length) {
                return (Right[]) arrayList.toArray(new Right[arrayList.size()]);
            }
            if (zArr[i10]) {
                arrayList.add(Right.getInstance((char) i10));
            }
            i10++;
        }
    }

    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean[] zArr = this.rights;
            if (i10 >= zArr.length) {
                return i11;
            }
            if (zArr[i10]) {
                i11++;
            }
            i10++;
        }
    }

    public void remove(Right right) {
        this.rights[right.right] = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.rights;
            if (i10 >= zArr.length) {
                return sb2.toString();
            }
            if (zArr[i10]) {
                sb2.append((char) i10);
            }
            i10++;
        }
    }

    public void add(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.rights;
            if (i10 >= zArr.length) {
                return;
            }
            if (zArr[i10]) {
                this.rights[i10] = true;
            }
            i10++;
        }
    }

    public boolean contains(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.rights;
            if (i10 >= zArr.length) {
                return true;
            }
            if (zArr[i10] && !this.rights[i10]) {
                return false;
            }
            i10++;
        }
    }

    public void remove(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.rights;
            if (i10 >= zArr.length) {
                return;
            }
            if (zArr[i10]) {
                this.rights[i10] = false;
            }
            i10++;
        }
    }

    public Rights(Rights rights) {
        boolean[] zArr = new boolean[128];
        this.rights = zArr;
        System.arraycopy(rights.rights, 0, zArr, 0, zArr.length);
    }

    public Rights(String str) {
        this.rights = new boolean[128];
        for (int i10 = 0; i10 < str.length(); i10++) {
            add(Right.getInstance(str.charAt(i10)));
        }
    }

    public Rights(Right right) {
        boolean[] zArr = new boolean[128];
        this.rights = zArr;
        zArr[right.right] = true;
    }
}

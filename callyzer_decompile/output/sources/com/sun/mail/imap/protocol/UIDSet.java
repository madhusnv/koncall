package com.sun.mail.imap.protocol;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class UIDSet {
    public long end;
    public long start;

    public UIDSet() {
    }

    public static UIDSet[] createUIDSets(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr.length) {
            UIDSet uIDSet = new UIDSet();
            uIDSet.start = jArr[i10];
            do {
                i10++;
                if (i10 < jArr.length) {
                }
                uIDSet.end = jArr[i10 - 1];
                arrayList.add(uIDSet);
            } while (jArr[i10] == jArr[i10 - 1] + 1);
            uIDSet.end = jArr[i10 - 1];
            arrayList.add(uIDSet);
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }

    public static UIDSet[] parseUIDSets(String str) throws NumberFormatException {
        UIDSet uIDSet;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",:", true);
        loop0: while (true) {
            uIDSet = null;
            while (stringTokenizer.hasMoreTokens()) {
                try {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.equals(",")) {
                        if (uIDSet != null) {
                            arrayList.add(uIDSet);
                        }
                    } else if (!strNextToken.equals(":")) {
                        long j6 = Long.parseLong(strNextToken);
                        if (uIDSet != null) {
                            uIDSet.end = j6;
                        } else {
                            uIDSet = new UIDSet(j6, j6);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            break loop0;
        }
        if (uIDSet != null) {
            arrayList.add(uIDSet);
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }

    public static long[] toArray(UIDSet[] uIDSetArr) {
        if (uIDSetArr == null) {
            return null;
        }
        long[] jArr = new long[(int) size(uIDSetArr)];
        int i10 = 0;
        for (UIDSet uIDSet : uIDSetArr) {
            long j6 = uIDSet.start;
            while (j6 <= uIDSet.end) {
                jArr[i10] = j6;
                j6++;
                i10++;
            }
        }
        return jArr;
    }

    public static String toString(UIDSet[] uIDSetArr) {
        if (uIDSetArr == null) {
            return null;
        }
        if (uIDSetArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = uIDSetArr.length;
        int i10 = 0;
        while (true) {
            UIDSet uIDSet = uIDSetArr[i10];
            long j6 = uIDSet.start;
            long j10 = uIDSet.end;
            if (j10 > j6) {
                sb2.append(j6);
                sb2.append(':');
                sb2.append(j10);
            } else {
                sb2.append(j6);
            }
            i10++;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(',');
        }
    }

    public long size() {
        return (this.end - this.start) + 1;
    }

    public UIDSet(long j6, long j10) {
        this.start = j6;
        this.end = j10;
    }

    public static long size(UIDSet[] uIDSetArr) {
        long size = 0;
        if (uIDSetArr != null) {
            for (UIDSet uIDSet : uIDSetArr) {
                size += uIDSet.size();
            }
        }
        return size;
    }

    private static long size(UIDSet[] uIDSetArr, long j6) {
        long size;
        if (uIDSetArr == null) {
            return 0L;
        }
        long j10 = 0;
        for (UIDSet uIDSet : uIDSetArr) {
            if (j6 < 0) {
                size = uIDSet.size();
            } else {
                long j11 = uIDSet.start;
                if (j11 <= j6) {
                    long j12 = uIDSet.end;
                    if (j12 < j6) {
                        j10 += (j12 - j11) + 1;
                    } else {
                        size = (j6 - j11) + 1;
                    }
                }
            }
            j10 += size;
        }
        return j10;
    }

    public static long[] toArray(UIDSet[] uIDSetArr, long j6) {
        if (uIDSetArr == null) {
            return null;
        }
        long[] jArr = new long[(int) size(uIDSetArr, j6)];
        int i10 = 0;
        for (UIDSet uIDSet : uIDSetArr) {
            long j10 = uIDSet.start;
            while (j10 <= uIDSet.end && (j6 < 0 || j10 <= j6)) {
                jArr[i10] = j10;
                j10++;
                i10++;
            }
        }
        return jArr;
    }
}

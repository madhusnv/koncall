package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.Arrays;
import p001o.ax7;

/* loaded from: classes3.dex */
public abstract class zy7 {
    /* renamed from: a */
    public static final byte[] m60082a(byte[] bArr, byte[] bArr2, uk7 uk7Var) {
        sq8.m48649h(bArr, TransferTable.COLUMN_KEY);
        sq8.m48649h(bArr2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(uk7Var, "hashSupplier");
        return m60083b(bArr, bArr2, (ax7) uk7Var.invoke());
    }

    /* renamed from: b */
    public static final byte[] m60083b(byte[] bArr, byte[] bArr2, ax7 ax7Var) {
        sq8.m48649h(bArr, TransferTable.COLUMN_KEY);
        sq8.m48649h(bArr2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(ax7Var, "hashFunction");
        byte[] bArrM60084c = m60084c(bArr, ax7Var);
        byte[] bArrM60085d = m60085d(bArrM60084c, (byte) 54);
        byte[] bArrM60085d2 = m60085d(bArrM60084c, (byte) 92);
        ax7.C12265a.m17935a(ax7Var, bArrM60085d, 0, 0, 6, null);
        ax7.C12265a.m17935a(ax7Var, bArr2, 0, 0, 6, null);
        byte[] bArrMo17932a = ax7Var.mo17932a();
        ax7.C12265a.m17935a(ax7Var, bArrM60085d2, 0, 0, 6, null);
        ax7.C12265a.m17935a(ax7Var, bArrMo17932a, 0, 0, 6, null);
        return ax7Var.mo17932a();
    }

    /* renamed from: c */
    public static final byte[] m60084c(byte[] bArr, ax7 ax7Var) {
        int iMo17934c = ax7Var.mo17934c();
        if (bArr.length > iMo17934c) {
            bArr = bx7.m19911c(bArr, ax7Var);
        }
        if (bArr.length >= iMo17934c) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, iMo17934c);
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* renamed from: d */
    public static final byte[] m60085d(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ b);
        }
        return bArr2;
    }
}

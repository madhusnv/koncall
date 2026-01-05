package og;

import android.net.Uri;
import android.os.Build;
import c9.AbstractC0928w;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1561o;
import d3.InterfaceC1563q;
import d9.AbstractC1656a;
import d9.C1664i;
import f3.AbstractC2199e;
import g4.C2501q;
import g4.C2503s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import r4.C6457l;
import t8.C7058d;
import t8.EnumC7055a;
import t8.EnumC7078x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ka {
    /* renamed from: a */
    public static final LinkedHashSet m10727a(byte[] bytes) throws IOException {
        ObjectInputStream objectInputStream;
        AbstractC4154l.m8923f(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            int i10 = objectInputStream.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean z6 = objectInputStream.readBoolean();
                AbstractC4154l.m8922e(uri, "uri");
                linkedHashSet.add(new C7058d(z6, uri));
            }
            objectInputStream.close();
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    /* renamed from: b */
    public static final void m10728b(C2501q c2501q, InterfaceC1563q interfaceC1563q, AbstractC1561o abstractC1561o, float f6, d3.k0 k0Var, C6457l c6457l, AbstractC2199e abstractC2199e) {
        ArrayList arrayList = c2501q.f13704h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2503s c2503s = (C2503s) arrayList.get(i10);
            c2503s.f13709a.m6419g(interfaceC1563q, abstractC1561o, f6, k0Var, c6457l, abstractC2199e);
            interfaceC1563q.mo5112n(DefinitionKt.NO_Float_VALUE, c2503s.f13709a.m6414b());
        }
    }

    /* renamed from: c */
    public static final EnumC7055a m10729c(int i10) {
        if (i10 == 0) {
            return EnumC7055a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC7055a.LINEAR;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Could not convert ", " to BackoffPolicy"));
    }

    /* renamed from: d */
    public static final EnumC7078x m10730d(int i10) {
        if (i10 == 0) {
            return EnumC7078x.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return EnumC7078x.CONNECTED;
        }
        if (i10 == 2) {
            return EnumC7078x.UNMETERED;
        }
        if (i10 == 3) {
            return EnumC7078x.NOT_ROAMING;
        }
        if (i10 == 4) {
            return EnumC7078x.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Could not convert ", " to NetworkType"));
        }
        return EnumC7078x.TEMPORARILY_UNMETERED;
    }

    /* renamed from: e */
    public static final t8.c0 m10731e(int i10) {
        if (i10 == 0) {
            return t8.c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return t8.c0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    /* renamed from: f */
    public static final t8.e0 m10732f(int i10) {
        if (i10 == 0) {
            return t8.e0.ENQUEUED;
        }
        if (i10 == 1) {
            return t8.e0.RUNNING;
        }
        if (i10 == 2) {
            return t8.e0.SUCCEEDED;
        }
        if (i10 == 3) {
            return t8.e0.FAILED;
        }
        if (i10 == 4) {
            return t8.e0.BLOCKED;
        }
        if (i10 == 5) {
            return t8.e0.CANCELLED;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Could not convert ", " to State"));
    }

    /* renamed from: g */
    public static final int m10733g(t8.e0 state) {
        AbstractC4154l.m8923f(state, "state");
        switch (AbstractC0928w.f5670a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public static final C1664i m10734h(byte[] bytes) throws IOException {
        AbstractC4154l.m8923f(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new C1664i(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                C1664i c1664iM5367a = AbstractC1656a.m5367a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return c1664iM5367a;
            } finally {
            }
        } finally {
        }
    }
}

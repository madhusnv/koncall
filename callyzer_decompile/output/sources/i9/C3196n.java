package i9;

import ex.InterfaceC2141e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.TimeoutCancellationException;
import nx.AbstractC5163a;
import og.od;
import og.s1;
import qw.C6361k;
import tx.InterfaceC7266z;
import tx.z1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.n */
/* loaded from: classes.dex */
public final class C3196n extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Process f17216a;

    /* renamed from: b */
    public BufferedReader f17217b;

    /* renamed from: c */
    public StringBuilder f17218c;

    /* renamed from: d */
    public int f17219d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f17220e;

    /* renamed from: f */
    public final /* synthetic */ long f17221f;

    /* renamed from: g */
    public final /* synthetic */ long f17222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3196n(ArrayList arrayList, long j6, long j10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f17220e = arrayList;
        this.f17221f = j6;
        this.f17222g = j10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C3196n(this.f17220e, this.f17221f, this.f17222g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3196n) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedReader bufferedReader;
        StringBuilder sb2;
        Process process;
        String string;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f17219d;
        if (i10 == 0) {
            od.m10798c(obj);
            Process processStart = new ProcessBuilder(new String[0]).command(this.f17220e).start();
            InputStream inputStream = processStart.getInputStream();
            AbstractC4154l.m8922e(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, AbstractC5163a.f25245a), 8192);
            StringBuilder sb3 = new StringBuilder();
            C3195m c3195m = new C3195m(bufferedReader2, new char[1024], sb3, this.f17222g, processStart, null);
            this.f17216a = processStart;
            this.f17217b = bufferedReader2;
            this.f17218c = sb3;
            this.f17219d = 1;
            long j6 = this.f17221f;
            if (j6 <= 0) {
                throw new TimeoutCancellationException("Timed out immediately", null);
            }
            if (tx.c0.m13470F(new z1(j6, this), c3195m) == enumC7794a) {
                return enumC7794a;
            }
            bufferedReader = bufferedReader2;
            sb2 = sb3;
            process = processStart;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = this.f17218c;
            bufferedReader = this.f17217b;
            process = this.f17216a;
            od.m10798c(obj);
        }
        bufferedReader.close();
        if (process.exitValue() == 0) {
            string = sb2.toString();
        } else {
            InputStream errorStream = process.getErrorStream();
            AbstractC4154l.m8922e(errorStream, "getErrorStream(...)");
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(errorStream, AbstractC5163a.f25245a), 8192);
            try {
                String strM10887b = s1.m10887b(bufferedReader3);
                bufferedReader3.close();
                string = strM10887b;
            } finally {
            }
        }
        AbstractC4154l.m8920c(string);
        return new C6361k(new Integer(process.exitValue()), string);
    }
}

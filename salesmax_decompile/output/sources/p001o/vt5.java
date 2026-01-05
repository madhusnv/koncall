package p001o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p001o.ot5;
import p001o.tt5;

/* loaded from: classes5.dex */
public class vt5 implements ot5 {

    /* renamed from: b */
    public final File f50861b;

    /* renamed from: c */
    public final long f50862c;

    /* renamed from: e */
    public tt5 f50864e;

    /* renamed from: d */
    public final rt5 f50863d = new rt5();

    /* renamed from: a */
    public final d0f f50860a = new d0f();

    public vt5(File file, long j) {
        this.f50861b = file;
        this.f50862c = j;
    }

    /* renamed from: c */
    public static ot5 m53400c(File file, long j) {
        return new vt5(file, j);
    }

    @Override // p001o.ot5
    /* renamed from: a */
    public void mo42649a(ic9 ic9Var, ot5.InterfaceC15890b interfaceC15890b) {
        tt5 tt5VarM53401d;
        String strM22179b = this.f50860a.m22179b(ic9Var);
        this.f50863d.m47142a(strM22179b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(strM22179b);
                sb.append(" for for Key: ");
                sb.append(ic9Var);
            }
            try {
                tt5VarM53401d = m53401d();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            if (tt5VarM53401d.m50503K(strM22179b) != null) {
                return;
            }
            tt5.C17200c c17200cM50501D = tt5VarM53401d.m50501D(strM22179b);
            if (c17200cM50501D == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strM22179b);
            }
            try {
                if (interfaceC15890b.mo21806a(c17200cM50501D.m50518f(0))) {
                    c17200cM50501D.m50517e();
                }
                c17200cM50501D.m50516b();
            } catch (Throwable th) {
                c17200cM50501D.m50516b();
                throw th;
            }
        } finally {
            this.f50863d.m47143b(strM22179b);
        }
    }

    @Override // p001o.ot5
    /* renamed from: b */
    public File mo42650b(ic9 ic9Var) {
        String strM22179b = this.f50860a.m22179b(ic9Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(strM22179b);
            sb.append(" for for Key: ");
            sb.append(ic9Var);
        }
        try {
            tt5.C17202e c17202eM50503K = m53401d().m50503K(strM22179b);
            if (c17202eM50503K != null) {
                return c17202eM50503K.m50533a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized tt5 m53401d() {
        if (this.f50864e == null) {
            this.f50864e = tt5.m50491Q(this.f50861b, 1, 1, this.f50862c);
        }
        return this.f50864e;
    }
}

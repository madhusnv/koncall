package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.zip.Inflater;
import p001o.wzc;

/* loaded from: classes6.dex */
public final class efj extends pz6 {

    /* renamed from: i */
    public static final C13182a f21582i = new C13182a(null);

    /* renamed from: j */
    public static final wzc f21583j = wzc.C18014a.m55482d(wzc.f52936b, "/", false, 1, null);

    /* renamed from: e */
    public final wzc f21584e;

    /* renamed from: f */
    public final pz6 f21585f;

    /* renamed from: g */
    public final Map f21586g;

    /* renamed from: h */
    public final String f21587h;

    /* renamed from: o.efj$a */
    public static final class C13182a {
        public C13182a() {
        }

        public /* synthetic */ C13182a(id5 id5Var) {
            this();
        }
    }

    public efj(wzc wzcVar, pz6 pz6Var, Map map, String str) {
        sq8.m48649h(wzcVar, "zipPath");
        sq8.m48649h(pz6Var, "fileSystem");
        sq8.m48649h(map, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f21584e = wzcVar;
        this.f21585f = pz6Var;
        this.f21586g = map;
        this.f21587h = str;
    }

    @Override // p001o.pz6
    /* renamed from: a */
    public rw6 mo24957a(wzc wzcVar) {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // p001o.pz6
    /* renamed from: b */
    public lzf mo24958b(wzc wzcVar) throws IllegalAccessException, IllegalArgumentException, FileNotFoundException, InvocationTargetException {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        dfj dfjVar = (dfj) this.f21586g.get(m24959c(wzcVar));
        if (dfjVar == null) {
            throw new FileNotFoundException("no such file: " + wzcVar);
        }
        rw6 rw6VarMo24957a = this.f21585f.mo24957a(this.f21584e);
        im1 th = null;
        try {
            im1 im1VarM51310c = uac.m51310c(rw6VarMo24957a.m47207t(dfjVar.m22994f()));
            if (rw6VarMo24957a != null) {
                try {
                    rw6VarMo24957a.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = im1VarM51310c;
        } catch (Throwable th3) {
            th = th3;
            if (rw6VarMo24957a != null) {
                try {
                    rw6VarMo24957a.close();
                } catch (Throwable th4) {
                    cl6.m21376a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        ffj.m26591j(th);
        return dfjVar.m22993e() == 0 ? new x17(th, dfjVar.m22995g(), true) : new x17(new di8(new x17(th, dfjVar.m22992d(), true), new Inflater(true)), dfjVar.m22995g(), false);
    }

    /* renamed from: c */
    public final wzc m24959c(wzc wzcVar) {
        return f21583j.m55478r(wzcVar, true);
    }
}

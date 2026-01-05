package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p001o.rz1;

/* loaded from: classes.dex */
public final class m0f extends ContentObserver {

    /* renamed from: a */
    public final Context f34599a;

    /* renamed from: b */
    public final String f34600b;

    /* renamed from: c */
    public volatile String f34601c;

    /* renamed from: o.m0f$a */
    public static final class C15192a extends jgg implements xk7 {

        /* renamed from: a */
        public int f34602a;

        /* renamed from: b */
        public final /* synthetic */ Uri f34603b;

        /* renamed from: c */
        public final /* synthetic */ int f34604c;

        /* renamed from: d */
        public final /* synthetic */ m0f f34605d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15192a(Uri uri, int i, m0f m0fVar, n64 n64Var) {
            super(1, n64Var);
            this.f34603b = uri;
            this.f34604c = i;
            this.f34605d = m0fVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C15192a(this.f34603b, this.f34604c, this.f34605d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            uq8.m51918f();
            if (this.f34602a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            Uri uri = this.f34603b;
            if (uri == null) {
                return null;
            }
            int i = this.f34604c;
            m0f m0fVar = this.f34605d;
            if (i > 5) {
                rz1 rz1VarM38140d = m0fVar.m38140d(uri);
                StringBuilder sb = new StringBuilder();
                sb.append("Call Recording: ");
                sb.append(rz1VarM38140d);
                if (m0fVar.m38139c(rz1VarM38140d)) {
                    ife.f28606f.m32075a().m32065d(rz1VarM38140d);
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C15192a) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0f(Handler handler, Context context, Uri uri, String str) {
        super(handler);
        sq8.m48649h(handler, "handler");
        sq8.m48649h(context, "context");
        sq8.m48649h(uri, "safUri");
        this.f34599a = context;
        this.f34600b = str;
        String path = uri.getPath();
        List listD0 = path != null ? f9g.D0(path, new String[]{":"}, false, 0, 6, null) : null;
        if (!(listD0 == null || listD0.isEmpty()) && listD0.size() > 1) {
            this.f34601c = (String) listD0.get(1);
        }
        String str2 = this.f34601c;
        StringBuilder sb = new StringBuilder();
        sb.append("After parsing relative path of the provided folder is: ");
        sb.append(str2);
    }

    /* renamed from: c */
    public final boolean m38139c(rz1 rz1Var) {
        if (this.f34601c != null && rz1Var.m47310h() != null) {
            String str = this.f34601c;
            sq8.m48646e(str);
            if (e9g.m24597K(str, rz1Var.m47310h(), false, 2, null)) {
                return true;
            }
        }
        String str2 = this.f34600b;
        if (str2 != null) {
            return e9g.m24597K(rz1Var.m47307e(), str2, false, 2, null);
        }
        return false;
    }

    /* renamed from: d */
    public final rz1 m38140d(Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String string;
        String string2;
        String string3;
        rz1.C16681a c16681a = new rz1.C16681a();
        c16681a.m47321j(uri);
        c16681a.m47313b(this.f34599a);
        ContentResolver contentResolver = this.f34599a.getContentResolver();
        sq8.m48646e(uri);
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_id", "_display_name", "_data", "date_added", "date_modified", "mime_type", "relative_path"}, null, null, "date_added DESC");
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    if (columnIndex > -1 && (string3 = cursorQuery.getString(columnIndex)) != null) {
                        c16681a.m47318g(string3);
                    }
                    int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                    if (columnIndex2 > -1 && (string2 = cursorQuery.getString(columnIndex2)) != null) {
                        c16681a.m47316e(string2);
                    }
                    int columnIndex3 = cursorQuery.getColumnIndex("_data");
                    if (columnIndex3 > -1 && (string = cursorQuery.getString(columnIndex3)) != null) {
                        c16681a.m47317f(string);
                    }
                    int columnIndex4 = cursorQuery.getColumnIndex("date_added");
                    if (columnIndex4 > -1) {
                        c16681a.m47314c(Long.valueOf(cursorQuery.getLong(columnIndex4) * 1000));
                    }
                    int columnIndex5 = cursorQuery.getColumnIndex("date_modified");
                    if (columnIndex5 > -1) {
                        c16681a.m47315d(Long.valueOf(cursorQuery.getLong(columnIndex5) * 1000));
                    }
                    int columnIndex6 = cursorQuery.getColumnIndex("mime_type");
                    if (columnIndex6 > -1) {
                        c16681a.m47319h(cursorQuery.getString(columnIndex6));
                    }
                    int columnIndex7 = cursorQuery.getColumnIndex("relative_path");
                    if (columnIndex7 > -1) {
                        c16681a.m47320i(cursorQuery.getString(columnIndex7));
                    }
                } finally {
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(cursorQuery, null);
        }
        return c16681a.m47312a();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        sb.append(" --> ");
        sb.append(uri);
        onChange(z, uri, 0);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Change processed: ");
        sb.append(z);
        sb.append(" --> ");
        sb.append(uri);
        sb.append(" --> ");
        sb.append(i);
        p74.f39487a.m43079g(new C15192a(uri, i, this, null));
    }
}

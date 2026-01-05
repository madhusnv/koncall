package p001o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p001o.qd4;

/* loaded from: classes2.dex */
public abstract class pd4 extends BaseAdapter implements Filterable, qd4.InterfaceC16338a {

    /* renamed from: a */
    public boolean f39854a;

    /* renamed from: b */
    public boolean f39855b;

    /* renamed from: c */
    public Cursor f39856c;

    /* renamed from: d */
    public Context f39857d;

    /* renamed from: e */
    public int f39858e;

    /* renamed from: f */
    public C16064a f39859f;

    /* renamed from: g */
    public DataSetObserver f39860g;

    /* renamed from: h */
    public qd4 f39861h;

    /* renamed from: o.pd4$a */
    public class C16064a extends ContentObserver {
        public C16064a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            pd4.this.m43416i();
        }
    }

    /* renamed from: o.pd4$b */
    public class C16065b extends DataSetObserver {
        public C16065b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            pd4 pd4Var = pd4.this;
            pd4Var.f39854a = true;
            pd4Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            pd4 pd4Var = pd4.this;
            pd4Var.f39854a = false;
            pd4Var.notifyDataSetInvalidated();
        }
    }

    public pd4(Context context, Cursor cursor, boolean z) {
        m43415f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo20857a(Cursor cursor) {
        Cursor cursorM43417j = m43417j(cursor);
        if (cursorM43417j != null) {
            cursorM43417j.close();
        }
    }

    /* renamed from: b */
    public abstract CharSequence mo20858b(Cursor cursor);

    @Override // p001o.qd4.InterfaceC16338a
    /* renamed from: d */
    public Cursor mo43414d() {
        return this.f39856c;
    }

    /* renamed from: e */
    public abstract void mo20860e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public void m43415f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f39855b = true;
        } else {
            this.f39855b = false;
        }
        boolean z = cursor != null;
        this.f39856c = cursor;
        this.f39854a = z;
        this.f39857d = context;
        this.f39858e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f39859f = new C16064a();
            this.f39860g = new C16065b();
        } else {
            this.f39859f = null;
            this.f39860g = null;
        }
        if (z) {
            C16064a c16064a = this.f39859f;
            if (c16064a != null) {
                cursor.registerContentObserver(c16064a);
            }
            DataSetObserver dataSetObserver = this.f39860g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo30887g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f39854a || (cursor = this.f39856c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f39854a) {
            return null;
        }
        this.f39856c.moveToPosition(i);
        if (view == null) {
            view = mo30887g(this.f39857d, this.f39856c, viewGroup);
        }
        mo20860e(view, this.f39857d, this.f39856c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f39861h == null) {
            this.f39861h = new qd4(this);
        }
        return this.f39861h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f39854a || (cursor = this.f39856c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f39856c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f39854a && (cursor = this.f39856c) != null && cursor.moveToPosition(i)) {
            return this.f39856c.getLong(this.f39858e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f39854a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f39856c.moveToPosition(i)) {
            if (view == null) {
                view = mo20861h(this.f39857d, this.f39856c, viewGroup);
            }
            mo20860e(view, this.f39857d, this.f39856c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    /* renamed from: h */
    public abstract View mo20861h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    public void m43416i() {
        Cursor cursor;
        if (!this.f39855b || (cursor = this.f39856c) == null || cursor.isClosed()) {
            return;
        }
        this.f39854a = this.f39856c.requery();
    }

    /* renamed from: j */
    public Cursor m43417j(Cursor cursor) {
        Cursor cursor2 = this.f39856c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C16064a c16064a = this.f39859f;
            if (c16064a != null) {
                cursor2.unregisterContentObserver(c16064a);
            }
            DataSetObserver dataSetObserver = this.f39860g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f39856c = cursor;
        if (cursor != null) {
            C16064a c16064a2 = this.f39859f;
            if (c16064a2 != null) {
                cursor.registerContentObserver(c16064a2);
            }
            DataSetObserver dataSetObserver2 = this.f39860g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f39858e = cursor.getColumnIndexOrThrow("_id");
            this.f39854a = true;
            notifyDataSetChanged();
        } else {
            this.f39858e = -1;
            this.f39854a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}

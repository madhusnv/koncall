package p001o;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class tnb extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public Context f47463a;

    /* renamed from: b */
    public List f47464b;

    /* renamed from: c */
    public LayoutInflater f47465c;

    /* renamed from: d */
    public Set f47466d;

    /* renamed from: e */
    public SparseBooleanArray f47467e;

    /* renamed from: o.tnb$a */
    public static class C17166a {

        /* renamed from: a */
        public TextView f47468a;

        /* renamed from: b */
        public ImageView f47469b;

        /* renamed from: c */
        public CheckBox f47470c;

        /* renamed from: a */
        public static C17166a m50237a(View view) {
            if (view == null) {
                return null;
            }
            if (view.getTag() != null) {
                return (C17166a) view.getTag();
            }
            C17166a c17166a = new C17166a();
            c17166a.f47468a = (TextView) view.findViewById(p8e.row_title);
            c17166a.f47469b = (ImageView) view.findViewById(p8e.row_icon);
            CheckBox checkBox = (CheckBox) view.findViewById(p8e.checkBox);
            c17166a.f47470c = checkBox;
            checkBox.setVisibility(0);
            view.setTag(c17166a);
            return c17166a;
        }
    }

    public tnb(Context context, List list, Set set) {
        this.f47463a = context;
        this.f47464b = list;
        this.f47466d = set;
        this.f47467e = new SparseBooleanArray(list.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f47467e.put(list.indexOf(jp6.m34205c((String) it.next())), true);
        }
        this.f47465c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void m50236a(int i, boolean z) {
        this.f47467e.put(i, z);
        if (z) {
            this.f47466d.add(((jp6) this.f47464b.get(i)).m34206b());
        } else {
            this.f47466d.remove(((jp6) this.f47464b.get(i)).m34206b());
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f47464b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        jp6 jp6Var = (jp6) this.f47464b.get(i);
        if (view == null) {
            view = this.f47465c.inflate(e9e.row, (ViewGroup) null);
        }
        C17166a c17166aM50237a = C17166a.m50237a(view);
        c17166aM50237a.f47468a.setText(jp6Var.m34208e());
        c17166aM50237a.f47470c.setTag(Integer.valueOf(i));
        c17166aM50237a.f47470c.setOnCheckedChangeListener(this);
        c17166aM50237a.f47470c.setChecked(this.f47467e.get(i, false));
        jp6Var.m34210g(this.f47463a);
        if (jp6Var.m34207d() != -1) {
            c17166aM50237a.f47469b.setImageResource(jp6Var.m34207d());
        }
        return view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m50236a(((Integer) compoundButton.getTag()).intValue(), z);
    }
}

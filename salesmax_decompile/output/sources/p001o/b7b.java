package p001o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.app.AbstractC2307c;
import androidx.mediarouter.media.C2318f;
import androidx.mediarouter.media.C2319g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class b7b extends dk0 {
    static final int MSG_UPDATE_ROUTES = 1;
    static final String TAG = "MediaRouteChooserDialog";
    private static final long UPDATE_ROUTES_DELAY_MS = 300;
    private C12293c mAdapter;
    private boolean mAttachedToWindow;
    private final C12292b mCallback;
    private final Handler mHandler;
    private long mLastUpdateTime;
    private ListView mListView;
    private final C2319g mRouter;
    private ArrayList<C2319g.h> mRoutes;
    private C2318f mSelector;
    private TextView mTitleView;

    /* renamed from: o.b7b$a */
    public class HandlerC12291a extends Handler {
        public HandlerC12291a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b7b.this.updateRoutes((List) message.obj);
        }
    }

    /* renamed from: o.b7b$b */
    public final class C12292b extends C2319g.a {
        public C12292b() {
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteAdded(C2319g c2319g, C2319g.h hVar) {
            b7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteChanged(C2319g c2319g, C2319g.h hVar) {
            b7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteRemoved(C2319g c2319g, C2319g.h hVar) {
            b7b.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C2319g.a
        public void onRouteSelected(C2319g c2319g, C2319g.h hVar) {
            b7b.this.dismiss();
        }
    }

    /* renamed from: o.b7b$c */
    public static final class C12293c extends ArrayAdapter implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final LayoutInflater f15646a;

        /* renamed from: b */
        public final Drawable f15647b;

        /* renamed from: c */
        public final Drawable f15648c;

        /* renamed from: d */
        public final Drawable f15649d;

        /* renamed from: e */
        public final Drawable f15650e;

        public C12293c(Context context, List list) {
            super(context, 0, list);
            this.f15646a = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{f6e.mediaRouteDefaultIconDrawable, f6e.mediaRouteTvIconDrawable, f6e.mediaRouteSpeakerIconDrawable, f6e.mediaRouteSpeakerGroupIconDrawable});
            this.f15647b = lk0.m37353b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
            this.f15648c = lk0.m37353b(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            this.f15649d = lk0.m37353b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            this.f15650e = lk0.m37353b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final Drawable m18253a(C2319g.h hVar) {
            int iM8352f = hVar.m8352f();
            return iM8352f != 1 ? iM8352f != 2 ? hVar.m8371y() ? this.f15650e : this.f15647b : this.f15649d : this.f15648c;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        /* renamed from: b */
        public final Drawable m18254b(C2319g.h hVar) {
            Uri uriM8356j = hVar.m8356j();
            if (uriM8356j != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uriM8356j), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load ");
                    sb.append(uriM8356j);
                }
            }
            return m18253a(hVar);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f15646a.inflate(i9e.mr_chooser_list_item, viewGroup, false);
            }
            C2319g.h hVar = (C2319g.h) getItem(i);
            TextView textView = (TextView) view.findViewById(b8e.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(b8e.mr_chooser_route_desc);
            textView.setText(hVar.m8359m());
            String strM8350d = hVar.m8350d();
            boolean z = true;
            if (hVar.m8349c() != 2 && hVar.m8349c() != 1) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(strM8350d)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(strM8350d);
            }
            view.setEnabled(hVar.m8370x());
            ImageView imageView = (ImageView) view.findViewById(b8e.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(m18254b(hVar));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return ((C2319g.h) getItem(i)).m8370x();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            C2319g.h hVar = (C2319g.h) getItem(i);
            if (hVar.m8370x()) {
                ImageView imageView = (ImageView) view.findViewById(b8e.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(b8e.mr_chooser_route_progress_bar);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                hVar.m8343I();
            }
        }
    }

    /* renamed from: o.b7b$d */
    public static final class C12294d implements Comparator {

        /* renamed from: a */
        public static final C12294d f15651a = new C12294d();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2319g.h hVar, C2319g.h hVar2) {
            return hVar.m8359m().compareToIgnoreCase(hVar2.m8359m());
        }
    }

    public b7b(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.m8239b(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i9e.mr_chooser_dialog);
        this.mRoutes = new ArrayList<>();
        this.mAdapter = new C12293c(getContext(), this.mRoutes);
        ListView listView = (ListView) findViewById(b8e.mr_chooser_list);
        this.mListView = listView;
        listView.setAdapter((ListAdapter) this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(R.id.empty));
        this.mTitleView = (TextView) findViewById(b8e.mr_chooser_title);
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.m8249s(this.mCallback);
        this.mHandler.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(C2319g.h hVar) {
        return !hVar.m8369w() && hVar.m8370x() && hVar.m8339E(this.mSelector);
    }

    public void onFilterRoutes(List<C2319g.h> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!onFilterRoute(list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            ArrayList arrayList = new ArrayList(this.mRouter.m8246m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, C12294d.f15651a);
            if (SystemClock.uptimeMillis() - this.mLastUpdateTime >= 300) {
                updateRoutes(arrayList);
                return;
            }
            this.mHandler.removeMessages(1);
            Handler handler = this.mHandler;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.mLastUpdateTime + 300);
        }
    }

    public void setRouteSelector(C2318f c2318f) {
        if (c2318f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(c2318f)) {
            return;
        }
        this.mSelector = c2318f;
        if (this.mAttachedToWindow) {
            this.mRouter.m8249s(this.mCallback);
            this.mRouter.m8239b(c2318f, this.mCallback, 1);
        }
        refreshRoutes();
    }

    @Override // p001o.dk0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.mTitleView.setText(charSequence);
    }

    public void updateLayout() {
        getWindow().setLayout(d7b.m22451b(getContext()), -2);
    }

    public void updateRoutes(List<C2319g.h> list) {
        this.mLastUpdateTime = SystemClock.uptimeMillis();
        this.mRoutes.clear();
        this.mRoutes.addAll(list);
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b7b(Context context, int i) {
        Context contextM7997b = AbstractC2307c.m7997b(context, i, false);
        super(contextM7997b, AbstractC2307c.m7998c(contextM7997b));
        this.mSelector = C2318f.f9224c;
        this.mHandler = new HandlerC12291a();
        this.mRouter = C2319g.m8234j(getContext());
        this.mCallback = new C12292b();
    }

    @Override // p001o.dk0, android.app.Dialog
    public void setTitle(int i) {
        this.mTitleView.setText(i);
    }
}

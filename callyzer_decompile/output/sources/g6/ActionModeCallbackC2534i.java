package g6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.i */
/* loaded from: classes.dex */
public final class ActionModeCallbackC2534i implements ActionMode.Callback {

    /* renamed from: a */
    public final ActionMode.Callback f13861a;

    /* renamed from: b */
    public final TextView f13862b;

    /* renamed from: c */
    public Class f13863c;

    /* renamed from: d */
    public Method f13864d;

    /* renamed from: e */
    public boolean f13865e;

    /* renamed from: f */
    public boolean f13866f = false;

    public ActionModeCallbackC2534i(ActionMode.Callback callback, TextView textView) {
        this.f13861a = callback;
        this.f13862b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f13861a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f13861a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f13861a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        TextView textView = this.f13862b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z6 = this.f13866f;
        Class cls = Integer.TYPE;
        if (!z6) {
            this.f13866f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f13863c = cls2;
                this.f13864d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f13865e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f13863c = null;
                this.f13864d = null;
                this.f13865e = false;
            }
        }
        try {
            Method declaredMethod = (this.f13865e && this.f13863c.isInstance(menu)) ? this.f13864d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                MenuItem menuItemAdd = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f13861a.onPrepareActionMode(actionMode, menu);
    }
}

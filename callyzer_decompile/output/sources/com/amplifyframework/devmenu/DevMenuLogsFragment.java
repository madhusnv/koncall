package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.fragment.app.j0;
import com.amplifyframework.core.C1183R;
import com.amplifyframework.logging.LogLevel;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DevMenuLogsFragment extends j0 {
    private DeveloperMenu developerMenu;
    private TextView logsText;
    private String searchQuery;
    private MenuItem selectedLogsFilterItem;

    /* JADX INFO: Access modifiers changed from: private */
    public void displayFilteredLogs() {
        this.logsText.setText(C1183R.string.placeholder_logs);
        this.logsText.setText(this.developerMenu.getFilteredLogs(this.searchQuery, this.selectedLogsFilterItem.getItemId() != C1183R.id.all_logs ? LogLevel.valueOf(this.selectedLogsFilterItem.getTitle().toString().toUpperCase(Locale.US)) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        requireActivity().openContextMenu(view);
    }

    @Override // androidx.fragment.app.j0
    public boolean onContextItemSelected(MenuItem menuItem) {
        this.selectedLogsFilterItem = menuItem;
        displayFilteredLogs();
        return true;
    }

    @Override // androidx.fragment.app.j0, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        requireActivity().getMenuInflater().inflate(C1183R.menu.dev_menu_logs_menu, contextMenu);
        if (this.selectedLogsFilterItem == null) {
            this.selectedLogsFilterItem = contextMenu.findItem(C1183R.id.all_logs);
        }
        contextMenu.findItem(this.selectedLogsFilterItem.getItemId()).setChecked(true);
    }

    @Override // androidx.fragment.app.j0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C1183R.layout.dev_menu_fragment_logs, viewGroup, false);
        this.developerMenu = DeveloperMenu.singletonInstance(getContext());
        TextView textView = (TextView) viewInflate.findViewById(C1183R.id.logs_text);
        this.logsText = textView;
        textView.setText(this.developerMenu.getLogs());
        ((SearchView) viewInflate.findViewById(C1183R.id.search_logs_field)).setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.amplifyframework.devmenu.DevMenuLogsFragment.1
            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                DevMenuLogsFragment.this.searchQuery = str;
                DevMenuLogsFragment.this.displayFilteredLogs();
                return true;
            }

            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                return false;
            }
        });
        Button button = (Button) viewInflate.findViewById(C1183R.id.filter_logs);
        registerForContextMenu(button);
        button.setOnClickListener(new ViewOnClickListenerC1188a(this, 1));
        return viewInflate;
    }
}

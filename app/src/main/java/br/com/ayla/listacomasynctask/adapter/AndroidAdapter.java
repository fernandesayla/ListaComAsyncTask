package br.com.ayla.listacomasynctask.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.ayla.listacomasynctask.R;
import br.com.ayla.listacomasynctask.model.Android;

/**
 * Created by logonrm on 29/01/2018.
 */

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.AndroidItemViewHolder>  {


    private final List<Android> androids;
    private Context context;
    private LayoutInflater layoutInflater;
    public AndroidAdapter(Context context, List<Android> androids){
        
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.androids = androids;


    }

    @Override
    public AndroidItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.item_android, parent, false);

        return  new AndroidItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AndroidItemViewHolder holder, int position) {
        Android android = androids.get(position);

        holder.tvApi.setText(android.getApi());
        holder.tvNome.setText(android.getNome());
        holder.tvVersao.setText(android.getVersao());


    }

    @Override
    public int getItemCount() {
        return androids.size();
    }

    protected class AndroidItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivLogo;

        private TextView tvNome;
        private TextView tvApi;
        private TextView tvVersao;

        public AndroidItemViewHolder(View itemView){
            super(itemView);
            ivLogo = itemView.findViewById(R.id.ivLogo);
            tvNome= itemView.findViewById(R.id.tvNome);
            tvApi= itemView.findViewById(R.id.tvApi);
            tvVersao = itemView.findViewById(R.id.tvVersao);

        }
    }

}

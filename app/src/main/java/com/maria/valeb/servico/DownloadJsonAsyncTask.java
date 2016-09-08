package com.maria.valeb.servico;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;

/**
 * Created by maria on 06/09/2016.
 */
public class DownloadJsonAsyncTask extends AsyncTask<String, Void, String> {

    private Context context;
    //private TarefaInterface it;
    private ProgressDialog progressDialog;

    @Override
    protected String doInBackground(String... params) {
        return null;
    }

    @Override
    protected List<> doInBackground(String... params) {
        String urlString = params[0];

        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet(urlString);

        try {
            HttpResponse response = httpclient.execute(httpget);

            HttpEntity entity = response.getEntity();

            if (entity != null) {
                InputStream instream = entity.getContent();

                String json = toString(instream);
                instream.close();

                List<Trend> trends = getTrends(json);

                return trends;
            }
        } catch (Exception e) {
            Log.e("DEVMEDIA", "Falha ao acessar Web service", e);
        }
        return null;
    }


}

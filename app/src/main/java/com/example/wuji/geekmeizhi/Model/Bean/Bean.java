package com.example.wuji.geekmeizhi.Model.Bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by wuji on 16-9-27.
 */

public class Bean {


    /**
     * error : false
     * results : [{"_id":"57e9e46f421aa95ddb9cb547","createdAt":"2016-09-27T11:15:59.299Z","desc":"秋天来了","publishedAt":"2016-09-27T11:41:22.507Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f87z2n2taej20u011h11h.jpg","used":true,"who":"代码家"},{"_id":"57e7e200421aa95dd351b076","createdAt":"2016-09-25T22:41:04.582Z","desc":"9-26","publishedAt":"2016-09-26T11:52:58.626Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f867mvc6qjj20u00u0wh7.jpg","used":true,"who":"daimajia"},{"_id":"57e477fa421aa95bc338987d","createdAt":"2016-09-23T08:31:54.365Z","desc":"9-23","publishedAt":"2016-09-23T11:38:57.170Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f837uocox8j20f00mggoo.jpg","used":true,"who":"daimajia"},{"_id":"57e319fd421aa95bc338986a","createdAt":"2016-09-22T07:38:37.240Z","desc":"9-22","publishedAt":"2016-09-22T11:44:08.156Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f820oxtdzzj20hs0hsdhl.jpg","used":true,"who":"代码家"},{"_id":"57e1c76c421aa95bd05015f2","createdAt":"2016-09-21T07:34:04.60Z","desc":"9-21","publishedAt":"2016-09-21T11:37:24.210Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f80uxtwgxrj20u011hdhq.jpg","used":true,"who":"daimajia"},{"_id":"57dff891421aa95bc7f06a66","createdAt":"2016-09-19T22:39:13.808Z","desc":"9-20","publishedAt":"2016-09-20T11:42:05.477Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f7z9uxopq0j20u011hju5.jpg","used":true,"who":"daimajia"},{"_id":"57de9714421aa95bc338982c","createdAt":"2016-09-18T21:31:00.863Z","desc":"9-19","publishedAt":"2016-09-19T11:36:25.457Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f7y296c5taj20u00u0tay.jpg","used":true,"who":"daimajia"},{"_id":"57dd46a4421aa95bcb130126","createdAt":"2016-09-17T21:35:32.195Z","desc":"9-18","publishedAt":"2016-09-18T11:36:10.609Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7wws4xk5nj20u011hwhb.jpg","used":true,"who":"daimajia"},{"_id":"57d8982f421aa95bd05015af","createdAt":"2016-09-14T08:22:07.587Z","desc":"9-14","publishedAt":"2016-09-14T11:35:01.991Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7sszr81ewj20u011hgog.jpg","used":true,"who":"daimajia"},{"_id":"57d741cc421aa95bc7f06a17","createdAt":"2016-09-13T08:01:16.18Z","desc":"9-13","publishedAt":"2016-09-13T11:36:54.991Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f7rmrmrscrj20u011hgp1.jpg","used":true,"who":"代码家"}]
     */

    private boolean error;
    /**
     * _id : 57e9e46f421aa95ddb9cb547
     * createdAt : 2016-09-27T11:15:59.299Z
     * desc : 秋天来了
     * publishedAt : 2016-09-27T11:41:22.507Z
     * source : chrome
     * type : 福利
     * url : http://ww1.sinaimg.cn/large/610dc034jw1f87z2n2taej20u011h11h.jpg
     * used : true
     * who : 代码家
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Parcelable{
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this._id);
            dest.writeString(this.createdAt);
            dest.writeString(this.desc);
            dest.writeString(this.publishedAt);
            dest.writeString(this.source);
            dest.writeString(this.type);
            dest.writeString(this.url);
            dest.writeByte(this.used ? (byte) 1 : (byte) 0);
            dest.writeString(this.who);
        }


        protected ResultsBean(Parcel in) {
            this._id = in.readString();
            this.createdAt = in.readString();
            this.desc = in.readString();
            this.publishedAt = in.readString();
            this.source = in.readString();
            this.type = in.readString();
            this.url = in.readString();
            this.used = in.readByte() != 0;
            this.who = in.readString();
        }

        public static final Parcelable.Creator<ResultsBean> CREATOR = new Parcelable.Creator<ResultsBean>() {
            @Override
            public ResultsBean createFromParcel(Parcel source) {
                return new ResultsBean(source);
            }

            @Override
            public ResultsBean[] newArray(int size) {
                return new ResultsBean[size];
            }
        };
    }
}

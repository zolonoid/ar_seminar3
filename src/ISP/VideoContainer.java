package ISP;

import java.io.InputStream;

public class VideoContainer implements AudioStream, VideoStream {
    @Override
    public InputStream getAudioStream() {
        return null;
    }

    @Override
    public InputStream getVideoStream() {
        return null;
    }
}

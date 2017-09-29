package com.wane.catnip.service.moment;

import com.wane.catnip.exception.MomentNotFoundException;
import com.wane.catnip.model.Image;
import com.wane.catnip.model.Moment;
import com.wane.catnip.model.MomentPreview;
import com.wane.catnip.model.MomentPreviews;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import static java.lang.String.format;
import static java.util.Arrays.asList;

@Service
public class DefaultMomentService implements MomentService {
    @Override
    public MomentPreviews retrievePreviews() {
        return new MomentPreviews(asList(
                previewKitty(),
                previewMax()
        ));
    }

    @Override
    public Moment retrieveMoment(String id) {
        if (id.equals("cat1")) {
            return momentKitty();
        }

        throw new MomentNotFoundException(format("Moment not found. Parameter: %s", id));
    }

    private MomentPreview previewKitty() {
        MomentPreview preview = new MomentPreview("cat1");
        preview.setCat("Kitty");
        preview.setAvatar(new Image("/image/avatar1.jpg"));
        preview.setTimestamp(DateTime.now().minusMinutes(5));
        preview.setMessage("Posted some new picture.");
        preview.setThumbs(asList(
                new Image("/image/thumb1.jpg"),
                new Image("/image/thumb2.jpg"),
                new Image("/image/thumb3.jpg")
        ));
        return preview;
    }

    private MomentPreview previewMax() {
        MomentPreview preview = new MomentPreview("cat2");
        preview.setCat("Max");
        preview.setAvatar(new Image("/image/avatar2.jpg"));
        preview.setTimestamp(DateTime.now().minusMinutes(10));
        preview.setMessage("Finally I have my cat.");
        preview.setThumbs(asList(
                new Image("/image/thumb1.jpg"),
                new Image("/image/thumb2.jpg")
        ));
        return preview;
    }

    private Moment momentKitty() {
        Moment moment = new Moment();
        moment.setCat("Kitty");
        moment.setMessage("I'm thinking, not sleeping.");
        moment.setBanner(new Image("/image/banner3.jpg"));
        moment.setAvatar(new Image("/image/avatar1.jpg"));
        moment.setAge(6);
        moment.setKind("American Shorthair");
        moment.setStars(389);
        moment.setFollows(389);
        moment.setFishes(99);
        moment.setAdopted(38);
        return moment;
    }
}

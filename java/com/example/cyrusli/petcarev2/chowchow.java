package com.example.cyrusli.petcarev2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cyrusli on 18/9/16.
 */
public class chowchow extends Fragment {
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.doginfo, container, false);


        tv = (TextView) v.findViewById(R.id.info);
        loadText();


        return v;
    }
    private void loadText() {
        String info = new String("Exercise Needs: 2/5\n" +
                "He's not really fond of being hugged or fussed over, but he'll be a quiet, attentive companion to his favorite person, and his loyalty extends to other family members. If he's raised with children, he'll accept them willingly, but he's not the type of dog to tolerate abuse, so he's best for homes with older kids who know how to treat dogs.\n" +
                "\n" +
                "If he has lots of positive encounters with strangers during his impressionable puppyhood, he'll handle strangers with equanimity. This is, however, a highly territorial and protective breed, who'll give a clear warning to anyone approaching without his person's welcome.\n" +
                "\n" +
                "The breed's most memorable physical feature may be his blue-black tongue. According to Chinese legend, the tongue got its blue hue at the time of creation, when a Chow licked up drops of the color as the sky was being painted. He also stands out for his almost straight rear legs, which give him a stiff, choppy, or stilted gait. He's not speedy, so he's not the best choice for a jogger, but he has excellent endurance and can be a good walking companion.\n" +
                "\n" +
                "When it comes to training, a verbal correction is usually all that's required to set the Chow Chow straight. No dog should ever be hit, but it's especially counterproductive with this breed. The fiercely proud and independent Chow will never respond to physical abuse. But earn his respect with firm consistency, and you won't have any problem training him.\n" +
                "\n" +
                "Vital Stats:\n" +
                "Breed Group: Working Dogs\n" +
                "Height: 1 foot, 5 inches to 1 foot, 8 inches tall at the shoulder\n" +
                "Weight: 40 to 70 pounds\n" +
                "Life Span: 12 to 15 years\n" +
                "\n" +
                "Health:\n" +
                "Canine Hip Dysplasia (CHD) is a heritable condition in which the thighbone doesn't fit snugly into the hip joint. Some dogs show pain and lameness on one or both rear legs, but you may not notice any signs of discomfort in a dog with hip dysplasia. As the dog ages, arthritis can develop. X-ray screening for hip dysplasia is done by the Orthopedic Foundation for Animals or the University of Pennsylvania Hip Improvement Program (PennHIP). Hip dysplasia is hereditary, but it can be worsened by environmental factors, such as rapid growth from a high-calorie diet or injuries incurred from jumping or falling on slick floors.\n" +
                "\n" +
                "Entropion causes the eyelid to roll inward, irritating or injuring the eyeball. One or both eyes can be affected. If your Chow Chow has entropion, you may notice him rubbing at his eyes. The condition can be corrected surgically.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 2 to 2 3/4 cups of a high-quality dog food daily, divided into two meals.\n" +
                "\n" +
                "How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "Keep your Chow in good shape by measuring his food and feeding him twice a day rather than leaving food out all the time. If you're unsure whether he's overweight, give him the eye test and the hands-on test. First, look down at him. You should be able to see a waist. Then place your hands on his back, thumbs along the spine, with the fingers spread downward. You should be able to feel but not see his ribs without having to press hard. If you can't, he needs less food and more exercise.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}
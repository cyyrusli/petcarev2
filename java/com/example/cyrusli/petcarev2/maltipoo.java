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
public class maltipoo extends Fragment {
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
        String info = new String("Exercise Needs: 3/5\n" +
                "Cross breeds such as the Maltipoo are often referred to as designer dogs, rather than mixed breeds, because they're purposely bred and are a combination of two known breeds.\n" +
                "\n" +
                "Because both Poodles and Maltese are considered non-shedders, people who breed Maltipoos hope to end up with a hypoallergenic dog. If you're allergic, however, it's important to know a little something about pet allergies before you run out to get a Maltipoo.\n" +
                "\n" +
                "All dogs produce dander (dead skin flakes) and saliva, which carry allergens. And allergies can build over time. You may not react to a dog when you first meet him, but develop an allergy after living with him for days, weeks, or even months. Spend lots of time with a number of different Maltipoos to see how you'll react.\n" +
                "\n" +
                "If you decide that a Maltipoo is for you, you'll find that he's an active, feisty, fun-loving dog. He enjoys life, and his perfect day includes playing dog games, going for a walk, and racing through the house.\n" +
                "\n" +
                "Maltipoos can be a good choice for first-time or timid owners. They're easy to train and learn quickly. They also do well in homes with elderly people or with older children who can handle them carefully. They enjoy long cuddles and are sensitive to their people's wants and needs.\n" +
                "\n" +
                "Maltipoos can adapt to any kind of home, from an apartment to a house. No matter what their housing, they love being with their people, and should live indoors with their human families, never outside or in kennels. They're not recommended for homes where they'll be left alone for long periods.\n" +
                "\n" +
                "Maltipoos can be barkers and will alert you to everything that's going on. You may need to work hard to teach them to discriminate between what's important to bark at and what's not.\n" +
                "\n" +
                "Maltipoos are fun-loving, happy dogs who've stolen many hearts. For those who appreciate their cuddly appeal and can give them the companionship they need, they can make an ideal pet.\n" +
                "\n" +
                "Vital Needs:\n" +
                "Breed Group: Hybrid Dogs\n" +
                "Height: 8 inches to 1 foot, 2 inches tall at the shoulder\n" +
                "Weight: 5 to 20 pounds\n" +
                "Life Span: 10 to 13 years\n" +
                "\n" +
                "Health:\n" +
                "White Shaker Syndrome: Manifests as tremors over the entire body, lack of coordination, and rapid eye movements. Episodes usually start when the dog is six months to three years old and is stressed or overly excited. This condition isn't painful and doesn't affect the dog's personality. If you suspect your Maltipoo has White Dog Shaker Syndrome, talk to your vet about treatment options.\n" +
                "\n" +
                "Epilepsy: Causes seizures in the dog. Epilepsy can be managed with medication, but it cannot be cured. A dog can live a full and healthy life with the proper management of this disorder, which can be hereditary or of unknown cause.\n" +
                "\n" +
                "Patellar Luxation:, Also known as \"slipped stifles,\" is a common problem in small dogs. It is caused when the patella, which has three parts-the femur (thigh bone), patella (knee cap), and tibia (calf)-is not properly lined up. This causes lameness in the leg or an abnormal gait, sort of like a skip or a hop. It is a condition that is present at birth although the actual misalignment or luxation does not always occur until much later. The rubbing caused by patellar luxation can lead to arthritis, a degenerative joint disease. There are four grades of patellar luxation, ranging from grade I, an occasional luxation causing temporary lameness in the joint, to grade IV, in which the turning of the tibia is severe and the patella cannot be realigned manually. This gives the dog a bowlegged appearance. Severe grades of patellar luxation may require surgical repair.\n" +
                "\n" +
                "Portosystemic Shunt (PSS) is an abnormal flow of blood between the liver and the body. That's a problem, because the liver is responsible for detoxifying the body, metabolizing nutrients, and eliminating drugs. Signs can include but are not limited to neurobehavioral abnormalities such as poor balance, lack of appetite, hypoglycemia (low blood sugar), intermittent gastrointestinal issues, loss of appetite, urinary tract problems, drug intolerance, and stunted growth. Signs usually appear before two years of age. Corrective surgery can be helpful in long-term management, as can a special diet.\n" +
                "\n" +
                "Progressive Retinal Atrophy (PRA) is a degenerative eye disorder that eventually causes blindness from the loss of photoreceptors at the back of the eye. PRA is detectable years before the dog shows any signs of blindness. Fortunately, dogs can use their other senses to compensate for blindness, and a blind dog can live a full and happy life. Just don't make it a habit to move the furniture around. Reputable breeders have their dogs' eyes certified annually by a veterinary ophthalmologist and do not breed dogs with this disease.\n" +
                "\n" +
                "Legg-Calve-Perthes Disease affects many toy breeds. When your Maltipoo has Legg-Perthes, the blood supply to the head of the femur (the large rear leg bone) is decreased, and the head of the femur, which connects to the pelvis, begins to disintegrate. Usually, the first signs of Legg-Perthes, limping and atrophy of the leg muscle, occur when puppies are 4 to 6 months old. The condition can be corrected with surgery to cut off the diseased femur so that it isn't attached to the pelvis any longer. The scar tissue that results from the surgery creates a false joint and the puppy is usually pain free. Prognosis is generally very good after the surgery and many dogs suffer only minor lameness, particularly during weather changes.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 5/8 to 1.5 cups of a high-quality dog food daily, divided into two meals.\n" +
                "\n" +
                "How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "Keep your Maltipoo in good shape by measuring his food and feeding him twice a day rather than leaving food out all the time. If you're unsure whether he's overweight, give him the eye test and the hands-on test. First, look down at him. You should be able to see a waist. Then place your hands on his back, thumbs along the spine, with the fingers spread downward. You should be able to feel but not see his ribs without having to press hard. If you can't, he needs less food and more exercise.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}
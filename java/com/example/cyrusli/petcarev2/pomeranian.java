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
public class pomeranian extends Fragment {
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
                "Cute, feisty and furry, Poms are intelligent and loyal to their families. Don't let their cuteness fool you, however. These independent, bold dogs have minds of their own. They are alert and curious about the world around them. Unfortunately, in their minds, they are much larger than they really are, which can sometimes lead them to harass and even attack much larger dogs.\n" +
                "\n" +
                "Luckily, if they are properly socialized with other dogs and animals, they generally get along quite well with them.\n" +
                "Pomeranians have a wedge-shaped head with erect ears. Some people describe their faces as fox-like, while others think that \"baby-doll\" or \"pansy\" is a better description.\n" +
                "\n" +
                "Their dark, almond-shaped eyes sparkle with intelligence and curiosity. Their noses can be dark or the same color as their coats. Their distinctive plumed tail fans out over their back.\n" +
                "\n" +
                "Pomeranians come in a wide variety of solid colors, with red, orange, white or cream, blue, brown, or black being the most common. Rarely, you might see a white Pom with colored markings (called parti-colored), or a black and tan one, or even an orange and sable one. The Pom's profuse double coat stands out from his body, and he has a luxurious ruff around his neck and chest. The coats looks as though it would be difficult to care for, but in reality, regular brushing is typically all it needs.\n" +
                "\n" +
                "Despite their small size, Pomeranians have a loud bark and make excellent watchdogs. They sometimes don't know when to stop barking, however, so it's a good idea to train them to stop barking on command.\n" +
                "\n" +
                "Pomeranians make excellent pets for older people and those who are busy, because they aren't an overly dependent breed. They are also good for apartment dwellers or homes that don't have a backyard. Because of their small size, they aren't recommended for families with small children who might injure them accidentally.\n" +
                "\n" +
                "Poms generally are good at learning tricks, but you must be consistent and firm when training them. If you don't establish yourself as top dog in your household, your Pom will be more than glad to take over and may even become snappish.\n" +
                "\n" +
                "Poms have a lot of energy and enjoy going for walks. They trot along, proudly holding their head up, meeting new people and exploring new sights and smells.\n" +
                "\n" +
                "More and more Poms are being trained in obedience, agility, tracking and flyball. Some also have been trained as hearing assistance dogs. They make excellent therapy dogs and bring delight and comfort to the sick and elderly in hospitals and nursing homes. If you'd like a pint-size companion with personality plus, the Pomeranian may be the choice for you.\n" +
                "\n" +
                "Vital Stats:\n" +
                "Breed Group: Companion Dogs\n" +
                "Height: 7 inches to 1 foot tall at the shoulder\n" +
                "Weight: 3 to 7 pounds\n" +
                "Life Span: 12 to 16 years\n" +
                "\n" +
                "Health:\n" +
                "Allergies: Some Pomeranians can suffer from a variety of allergies, ranging from contact allergies to food allergies. If your Pomeranian is licking his paws or rubbing his face a great deal, suspect that he has an allergy and have him checked by your vet.\n" +
                "\n" +
                "Epilepsy: Some Pomeranians develop epilepsy and have seizures. If your Pom has seizures, take him to the vet to determine what treatment is appropriate.\n" +
                "\n" +
                "Eye Problems: Pomeranians are prone to a variety of eye problems, including cataracts, dry eye (keratoconjunctivitis sicca) (dryness of the cornea and the conjunctiva), and tear duct problems. These problems can appear in young adult dogs and may lead to blindness if untreated. Contact your vet if you notice any redness, scarring, or excessive tearing.\n" +
                "\n" +
                "Hip Dysplasia: Hip dysplasia occurs occasionally in Pomeranians. Many factors, including genetics, environment and diet, are thought to contribute to this deformity of the hip joint. Affected Pomeranians usually are able to lead normal, healthy lives, unlike some of the large and giant breeds, who require surgery to get around easily.\n" +
                "\n" +
                "Legg-Perthes Disease: This is another disease involving the hip joint. Many toy breeds are prone to this condition. When your Pomeranian has Legg-Perthes, the blood supply to the head of the femur (the large rear leg bone) is decreased and the head of the femur that connects to the pelvis begins to disintegrate. Usually, the first signs of Legg-Perthes occur when puppies are 4 to 6 months old. The first signs are limping and atrophy of the leg muscle. Qualified vets can perform a surgery to cut off the diseased femur so that it isn't attached to the pelvis any longer. The scar tissue that results from the surgery creates a \"false joint\" and the puppy is usually pain free.\n" +
                "\n" +
                "Patellar Luxation: This is a very common problem for Poms. The patella is the kneecap. Luxation means dislocation of an anatomical part (as a bone at a joint). Patellar luxation is when the knee joint (often of a hind leg) slides in and out of place, causing pain. This can be crippling, but many dogs lead relatively normal lives with this condition.\n" +
                "\n" +
                "Collapsed Trachea: This is a condition in which the trachea, which carries air to the lungs, tends to collapse easily. The most common sign of a collapsed trachea is a chronic, dry, harsh cough that many describe as being similar to a \"goose honk.\" Since it can be caused by pulling too hard against a collar while walking, you should train your Pom to walk nicely beside you instead of pulling at the leash, or use a harness instead of a collar. Collapsed trachea can be treated medically or surgically.\n" +
                "\n" +
                "Dental Problems: Poms are prone to teeth and gum problems and early tooth loss. Watch for dental problems and take your Pom to the vet for regular dental exams.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 1/4 to 1/2 cup of high-quality dry food a day, divided into two meals.\n" +
                "\n" +
                "Note: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}
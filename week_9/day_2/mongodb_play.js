use zoo;

const id = ObjectId("62bada785336dacfa210a6bd");

db.animals.findOne({_id: id});

db.animals.updateOne(
    {
        _id: id
    },
    {
        $set: {name: "Cammy"}
    }
);

db.animals.deleteOne({_id: ObjectId("62bada785336dacfa210a6bc")});
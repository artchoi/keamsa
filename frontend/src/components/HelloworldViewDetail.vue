<template>

    <v-card outlined>
        <v-card-title>
            Helloworld # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="HellodId" v-model="item.hellodId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="WorldedId" v-model="item.worldedId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Hello" v-model="item.hello" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="World" v-model="item.world" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Count" v-model="item.count" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'HelloworldViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/helloworlds/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>


<template>

    <v-data-table
        :headers="headers"
        :items="helloworld"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'HelloworldView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "hellodId", value: "hellodId" },
                { text: "worldedId", value: "worldedId" },
                { text: "hello", value: "hello" },
                { text: "world", value: "world" },
                { text: "count", value: "count" },
            ],
            helloworld : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/helloworlds'))

            temp.data._embedded.helloworlds.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.helloworld = temp.data._embedded.helloworlds;
        },
        methods: {
        }
    }
</script>

